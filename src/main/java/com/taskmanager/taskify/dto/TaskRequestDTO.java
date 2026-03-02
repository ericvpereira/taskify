package com.taskmanager.taskify.dto;

import jakarta.validation.constraints.*;

public record TaskRequestDTO(

        @NotBlank String title,
        String description,
        @Min(1) @Max(5) Integer priority

) {}