package com.example.todo_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo_api.model.TodoModel;
import com.example.todo_api.service.TodoService;


@RestController //"This class is a REST API controller."
// http://localhost:8080/todos
@RequestMapping("/todos") //This defines the base URL for all methods inside this controller.So every endpoint in this controller starts with:/todos

public class TodoController {
    private TodoService todoSer;

    public TodoController(TodoService todoSer)//Spring's dependency injection mechanism automatically provides the TodoService instance to the controller.
    {
        this.todoSer = todoSer;
    }
    
    // http://localhost:8080/todos/createTodo
    @PostMapping("/createTodo")   //"When a POST request comes to /createTodo, execute the method below."
    public TodoModel createTodo(@RequestBody TodoModel task)
    {
        return todoSer.createTodo(task);
    }

    // http://localhost:8080/todos/getTodo
    @GetMapping("/getTodo")
    public List<TodoModel> getAllTodo(){
        return todoSer.getAllTodo();
    }
    
    @PutMapping("/updateTodo/{id}")
    public TodoModel updateTodo(@PathVariable Long id,@RequestBody TodoModel task)
    {
        return todoSer.updateTodo(id, task);
    }

    @DeleteMapping("/deleteTodo/{id}")
    public String deleteTodo(@PathVariable Long id)
    {
        todoSer.deleteTodo(id);
        return "TODO DELETED SUCCESSFULLY";
    }
}
