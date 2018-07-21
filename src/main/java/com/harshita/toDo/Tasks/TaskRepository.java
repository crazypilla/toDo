package com.harshita.toDo.Tasks;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task,String> {

    Task findByName(String name);
   // @Override
  Task findByTaskId(String taskId);

}
