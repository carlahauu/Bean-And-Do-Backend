package com.carlahau.productivity.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {

}
