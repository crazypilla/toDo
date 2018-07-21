package com.harshita.toDo.Categories;

import com.harshita.toDo.Tasks.Task;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "categories")
public class Category {

    @Id
    public String id;

    public String name;
    public List<Task> tasks;

    public Category() {

        this.tasks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Category(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public Category(String name, List<Task> tasks) {
       // this.id=id;
        this.name = name;
        this.tasks = tasks;
    }


    @Override
    public String toString() {
        return "Category{" +
                " name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
