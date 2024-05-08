package com.example.BackendCode.controller;

import com.example.BackendCode.entity.Backend;
import com.example.BackendCode.service.BackendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/backend")
@RestController
public class BackendController {

    @Autowired
    private BackendServiceImpl backendService;

    @GetMapping
    public List<Backend> findAll(){
        return  backendService.getAll();
    }
    @PostMapping
    public void save(@RequestBody Backend backend){
        backendService.saveTodo(backend);
    }

    @GetMapping("{/id}")
    public Backend findOne(@PathVariable Long id){
        return  backendService.getTodoById(id);
    }
    @PutMapping("{/id}")
    public void update(@PathVariable Long id, @RequestBody Backend backend){
        this.backendService.updateTodo(id, backend);
    }

    @DeleteMapping("{/id}")
    public void delete(@PathVariable Long id){
        this.backendService.deleteTodo(id);
    }
}
