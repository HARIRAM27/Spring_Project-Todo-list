package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.TodoModel;

public interface TodoRepository extends  JpaRepository<Long, TodoModel>{
        
}
