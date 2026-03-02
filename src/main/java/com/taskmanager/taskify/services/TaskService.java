package com.taskmanager.taskify.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.taskmanager.taskify.dto.TaskRequestDTO;
import com.taskmanager.taskify.dto.TaskResponseDTO;
import com.taskmanager.taskify.entities.Task;
import com.taskmanager.taskify.exception.ResourceNotFoundException;
import com.taskmanager.taskify.repositories.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskResponseDTO create(TaskRequestDTO dto) {
        Task task = new Task(dto.title(), dto.description(), dto.priority());
        repository.save(task);
        return toDTO(task);
    }

    public List<TaskResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public TaskResponseDTO findById(Long id) {
        Task task = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada"));
        return toDTO(task);
    }

    public void delete(Long id) {
        Task task = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada"));
        repository.delete(task);
    }

    private TaskResponseDTO toDTO(Task task) {
        return new TaskResponseDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getPriority(),
                task.getCreatedAt()
        );
    }
}