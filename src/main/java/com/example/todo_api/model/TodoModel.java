package com.example.todo_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //comes from JPA "@Entity tells JPA:"Treat this Java class as a database entity."
@Table (name = "todo_cse") //comes from JPA "Creates a table named todo_cse at database"
public class TodoModel {
    @Id //tells to database this field is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //"Generate the ID automatically."
    private Long id;
    private String task;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    

}
