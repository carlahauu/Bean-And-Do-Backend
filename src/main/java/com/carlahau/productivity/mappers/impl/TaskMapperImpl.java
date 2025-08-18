package com.carlahau.productivity.mappers.impl;

import com.carlahau.productivity.domain.dto.TaskDto;
import com.carlahau.productivity.domain.entities.Task;
import com.carlahau.productivity.mappers.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                null,
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle()
        );
    }

}
