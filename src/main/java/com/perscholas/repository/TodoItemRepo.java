package com.perscholas.repository;

import com.perscholas.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepo extends JpaRepository<TodoItem, Long> {
}
