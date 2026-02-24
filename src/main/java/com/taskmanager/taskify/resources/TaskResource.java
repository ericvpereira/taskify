package com.taskmanager.taskify.resources;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.taskify.entities.Task;
import com.taskmanager.taskify.entities.enums.TaskStatus;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {
	
	@GetMapping
	public ResponseEntity<Task> findAll() {
		Task task1 = new Task(1L, "Ler", "Leitura por pelo menos 20 minutos", TaskStatus.COMPLETED, 5, LocalDateTime.now());
		return ResponseEntity.ok().body(task1);
	}
	
	
	
	

}
