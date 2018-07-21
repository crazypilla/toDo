package com.harshita.toDo.Categories;

import com.harshita.toDo.Tasks.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(method=RequestMethod.GET, value="/categories")
    public Iterable<Category> category() {
        return categoryRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/categories")
    public void save(@RequestBody Category category) {
        categoryRepository.save(category);
        //return task.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/categories/{name}")
    public List<Task> show(@PathVariable String name) {
       Category cat= categoryRepository.findByName(name);
       return cat.tasks;
    }


    @RequestMapping(method=RequestMethod.PUT, value="/categories/{name}")
    public Category update(@PathVariable String id, @RequestBody Category product) {
        Category cat = categoryRepository.findByName(id);
        if(cat.getName() != null)
            cat.setName(product.getName());
        if(cat.getTasks() != null)
            cat.setTasks(product.getTasks());
        //());
        categoryRepository.save(cat);
        return cat;
    }

    @PostMapping(value="/categories/")
    public Category add(@RequestBody Category newCat) {

        categoryRepository.save(newCat);
        return newCat;


    }


    @RequestMapping(method=RequestMethod.DELETE, value="/categories/{name}")
    public String delete(@PathVariable String name) {
        Category c = categoryRepository.findByName(name);
        categoryRepository.delete(c);

        return "category deleted";
    }


}
