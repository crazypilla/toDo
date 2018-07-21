package com.harshita.toDo;
import com.harshita.toDo.Tasks.Task;
import com.harshita.toDo.Tasks.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner {

	@Autowired
	private TaskRepository taskRepository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		taskRepository.deleteAll();

		taskRepository.save(new Task("1","finances","pay rent"));
		taskRepository.save(new Task("2","food","grocery"));
		taskRepository.save(new Task("3","misc","pack passport"));


	/*	System.out.println("Tasks found with findAll():");
		System.out.println("-------------------------------");
		for (Task task : taskRepository.findAll()) {
			System.out.println(task);
		}
		System.out.println();
*/
		/*System.out.println("Task found with findByName('food'):");
		System.out.println("--------------------------------");
		System.out.println(taskRepository.findByName("food"));
*/


	}


}
