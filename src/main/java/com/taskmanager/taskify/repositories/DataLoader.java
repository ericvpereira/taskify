package com.taskmanager.taskify.repositories;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.taskmanager.taskify.entities.Task;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(TaskRepository repository) {
        return args -> {
            repository.save(new Task("Estudar JPA", "Revisar relacionamentos", 3));
            repository.save(new Task("Treinar API", "Criar novos endpoints", 4));
        };
    }
}