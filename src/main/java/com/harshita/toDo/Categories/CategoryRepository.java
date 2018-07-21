package com.harshita.toDo.Categories;

import com.harshita.toDo.Tasks.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category, String> {

     Category findByName(String name);

   // List<Task> findById(int id);

}