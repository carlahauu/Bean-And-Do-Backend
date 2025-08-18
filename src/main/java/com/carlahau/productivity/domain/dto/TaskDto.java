package com.carlahau.productivity.domain.dto;

import java.util.UUID;

public record TaskDto(
        UUID id,
        String title
) {
}
