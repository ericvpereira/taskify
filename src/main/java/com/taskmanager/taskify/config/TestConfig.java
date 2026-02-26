package com.taskmanager.taskify.config;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.taskmanager.taskify.entities.Task;
import com.taskmanager.taskify.entities.enums.TaskStatus;
import com.taskmanager.taskify.repositories.TaskRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Task t1 = new Task(null, "Academia", "Treinar por 2 horas", TaskStatus.COMPLETED, 5, LocalDateTime.now());
		Task t2 = new Task(null, "Programar", "Programar por 1 hora", TaskStatus.IN_PROGRESS, 5, LocalDateTime.now());
		
		taskRepository.saveAll(Arrays.asList(t1, t2));
		
	}
	
}
