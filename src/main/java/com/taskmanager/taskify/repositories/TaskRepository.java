package com.taskmanager.taskify.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.taskify.entities.Task;
import com.taskmanager.taskify.entities.enums.TaskStatus;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	List<Task> findByStatus(TaskStatus status);
}
