package com.taskmanager.taskify.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TaskRequestDTO {
	
	@NotBlank(message = "O titulo é obrigatório")
	@Size(min = 3, max = 100, message = "O título deve ter entre 3 a 100 caracteres")
	private String title;
	
	@Size(max = 255, message = "A descrição deve ter no máximo 255 caracteres")
	private String description;
	
	@Min(value = 1, message = "A prioridade mínima é 1")
	@Max(value = 5, message = "A prioridade máxima é 5")
	private Integer priority;
	
	public TaskRequestDTO() {}

	public TaskRequestDTO(String title, String description, Integer priority) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Integer getPriority() {
		return priority;
	}

}
