package com.carlahau.productivity.services.impl;

import com.carlahau.productivity.domain.entities.*;
import com.carlahau.productivity.repositories.CompletedTaskCountRepository;
import com.carlahau.productivity.repositories.TaskListRepository;
import com.carlahau.productivity.repositories.TaskRepository;
import com.carlahau.productivity.services.TaskService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService{
    private final TaskRepository taskRepository;
    private final TaskListRepository taskListRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public TaskServiceImpl(TaskRepository taskRepository, TaskListRepository taskListRepository, CompletedTaskCountRepository completedTaskCountRepository) {
        this.taskRepository = taskRepository;
        this.taskListRepository = taskListRepository;
    }


    @Override
    public List<Task> listTasks(UUID taskListId) {
        return taskRepository.findByTaskListId(taskListId);
    }

    @Transactional
    @Override
    public Task createTask(UUID taskListId, Task task) {
        if (task.getId() != null){
            throw new IllegalArgumentException("Task already has an ID!");
        }
        if (task.getTitle() == null || task.getTitle().isBlank()){
            throw new IllegalArgumentException("Task must have a title!");
        }
        TaskPriority taskPriority = Optional.ofNullable(task.getPriority())
                .orElse(TaskPriority.MEDIUM);
        TaskStatus taskStatus = TaskStatus.OPEN;

        TaskList taskList = taskListRepository.findById(taskListId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Task List ID provided!"));

        LocalDateTime currentTime = LocalDateTime.now();
        Task taskToSave = new Task(
                null,
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                taskStatus,
                taskPriority,
                currentTime,
                currentTime,
                taskList
        );
        return taskRepository.save(taskToSave);
    }

    @Override
    public Optional<Task> getTask(UUID taskListId, UUID taskId) {
        return taskRepository.findByTaskListIdAndId(taskListId, taskId);
    }

    @Override
    public Task updateTask(UUID taskListId, UUID taskId, Task task) {
        if (task.getId() == null){
            throw new IllegalArgumentException("Task must have an ID.");
        }
        if (!Objects.equals(task.getId(), taskId)){
            throw new IllegalArgumentException("Attempting to change task ID, which is not permitted!");
        }
        Task existingTask = taskRepository.findByTaskListIdAndId(taskListId, taskId).orElseThrow(() ->
                new IllegalArgumentException("Task not found!"));
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setPriority(task.getPriority());
        existingTask.setStatus(task.getStatus());
        existingTask.setDueDate(task.getDueDate());
        existingTask.setUpdated(LocalDateTime.now());
        if (task.getStatus() == TaskStatus.CLOSED) {
            incrementCount();
        }
        return taskRepository.save(existingTask);
    }

    @Override
    public void incrementCount() {
        jdbcTemplate.update("UPDATE completed_task_count SET task_count = task_count + 1 WHERE id = 1");
    }

    @Transactional
    @Override
    public void deleteTask(UUID taskListId, UUID taskId) {
        taskRepository.deleteByTaskListIdAndId(taskListId, taskId);
    }
}
