package com.carlahau.productivity.mappers;

import com.carlahau.productivity.domain.dto.TaskListDto;
import com.carlahau.productivity.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);

}
