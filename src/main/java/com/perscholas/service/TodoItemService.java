package com.perscholas.service;


import com.perscholas.entity.TodoItem;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public interface TodoItemService {

    public Iterable<TodoItem> getAll();

    public Optional<TodoItem> getById(Long id);

    public TodoItem save(TodoItem todoItem);

    public void delete(TodoItem todoItem);

}
