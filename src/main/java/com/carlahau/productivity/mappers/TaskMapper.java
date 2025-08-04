package com.carlahau.productivity.mappers;

import com.carlahau.productivity.domain.dto.TaskDto;
import com.carlahau.productivity.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);

}
