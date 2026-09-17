package com.example.todo_api.repo;

import org.springframework.data.jpa.repository.JpaRepository; //provided by Spring Data JPA and It gives you ready-made database operations.Eg:save(),findall()
import org.springframework.stereotype.Repository; //This allows you to use:@Repository

import com.example.todo_api.model.TodoModel; //This imports the TodoModel class you created earlier.

@Repository 
public interface TodoRepository extends JpaRepository<TodoModel, Long> { 

}
