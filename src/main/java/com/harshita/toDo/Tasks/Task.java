package com.harshita.toDo.Tasks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;





@JsonIgnoreProperties(ignoreUnknown = true)
public class Task {

    @Id
    public String id;
    public String taskId;
    public String name;
    public String description;

    public Task(String id,String name, String description) {
       this.taskId = id;
        this.name = name;
        this.description = description;
    }

    public Task(){}

    @Override
    public String toString() {
        return "Task{" +
                "id=" + taskId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return taskId;
    }

    public void setId(String id) {
        this.taskId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
