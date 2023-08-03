package com.perscholas.service;

import com.perscholas.entity.TodoItem;
import com.perscholas.repository.TodoItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;


@Service
public class TodoItemServiceImpl {

    @Autowired
    private TodoItemRepo todoItemRepo;


    public Iterable<TodoItem> getAll() {
        return todoItemRepo.findAll();
    }

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepo.findById(id);

    }


    public TodoItem save(TodoItem todoItem) {
        if (todoItem.getId() == null) {
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoItemRepo.save(todoItem);
    }

    public void delete(TodoItem todoItem) {
        todoItemRepo.delete(todoItem);
    }
}
