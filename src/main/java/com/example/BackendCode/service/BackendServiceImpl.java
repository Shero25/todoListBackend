package com.example.BackendCode.service;

import com.example.BackendCode.entity.Backend;
import com.example.BackendCode.repository.BackendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BackendServiceImpl implements BackendService{

    @Autowired
    private BackendRepo backendRepo;

    @Override
    public List<Backend> getAll() {
        return backendRepo.findAll();
    }

    @Override
    public void saveTodo(Backend todo) {
      this.backendRepo.save(todo);
    }

    @Override
    public Backend getTodoById(Long id) {
        Optional<Backend> optional = backendRepo.findById(id);
        Backend backend;
        if(optional.isPresent()){
            backend=optional.get();
        }else {
            throw new RuntimeException("todo for the id:" +id+ "is not found");
        }
        return backend;
    }

    @Override
    public void updateTodo(Long id, Backend todo) {
        Backend todoFromDb = backendRepo.findById(id).get();
        todoFromDb.setTaskName(todo.getTaskName());
        todoFromDb.setDesc(todo.getDesc());
        backendRepo.save(todoFromDb);
    }

    @Override
    public void deleteTodo(Long id) {
    this.backendRepo.deleteById(id);
    }
}
