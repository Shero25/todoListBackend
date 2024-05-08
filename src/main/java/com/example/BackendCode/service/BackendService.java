package com.example.BackendCode.service;

import com.example.BackendCode.entity.Backend;

import java.util.List;

public interface BackendService {

    List <Backend> getAll();

    void saveTodo(Backend todo);

    void updateTodo(Long id, Backend todo);

    Backend getTodoById(Long id);

    void deleteTodo(Long id);

}
