package com.todolist.demo.controller;
import
import com.todolist.demo.model.TodoTask;
import com.todolist.demo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")

public class TodoController {
     @Autowired
    private TodoRepo todoRepo;

     @GetMapping
     public List<TodoTask> findALL() {
         return todoRepo.findAll();

      @PostMapping
      public TodoTask save(@RequestBody TodoTask todoTask );

     }
}
