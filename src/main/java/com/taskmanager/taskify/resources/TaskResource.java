package com.taskmanager.taskify.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.taskify.entities.Task;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {
	
	@GetMapping
	public ResponseEntity<Task> findAll() {
		Task task1 = new Task();
		return ResponseEntity.ok().body(task1);
	}
	
	
	
	

}
