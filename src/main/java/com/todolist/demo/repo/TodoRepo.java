package com.todolist.demo.repo;

import com.todolist.demo.model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoTask, Long> {
}
