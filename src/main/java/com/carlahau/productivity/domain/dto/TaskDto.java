package com.carlahau.productivity.domain.dto;

import com.carlahau.productivity.domain.entities.TaskPriority;
import com.carlahau.productivity.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
