package com.taskmanager.taskify.dto;

import java.time.LocalDateTime;

import com.taskmanager.taskify.entities.enums.TaskStatus;

public record TaskResponseDTO(
        Long id,
        String title,
        String description,
        TaskStatus status,
        Integer priority,
        LocalDateTime createdAt
) {}