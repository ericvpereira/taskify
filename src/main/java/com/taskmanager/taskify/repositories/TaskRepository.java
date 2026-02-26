package com.taskmanager.taskify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.taskify.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
