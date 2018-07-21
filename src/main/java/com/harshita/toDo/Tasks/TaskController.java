package com.harshita.toDo.Tasks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(method=RequestMethod.GET, value="/tasks")
    public Iterable<Task> task() {
        return taskRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/tasks")
    public void save(@RequestBody Task task) {
        taskRepository.save(task);
        //return task.getId();
    }
/*
    @RequestMapping(method=RequestMethod.GET, value="/tasks/{id}")
    public Task show(@PathVariable String id) {
        return taskRepository.findByTaskId(id);
    }
*/

    @RequestMapping(method=RequestMethod.PUT, value="/tasks/{id}")
    public Task update(@PathVariable String id, @RequestBody Task product) {
        Task prod = taskRepository.findByTaskId(id);
        if(product.getName() != null)
            prod.setName(product.getName());
        if(product.getDescription() != null)
            prod.setDescription(product.getDescription());
        //());
        taskRepository.save(prod);
        return prod;
    }




    @RequestMapping(method=RequestMethod.DELETE, value="/tasks/{id}")
    public String delete(@PathVariable String id) {
        Task t = taskRepository.findByTaskId(id);
        taskRepository.delete(t);

        return "product deleted";
    }

}
