package com.harshita.toDo;
import com.harshita.toDo.Categories.Category;
import com.harshita.toDo.Categories.CategoryRepository;
import com.harshita.toDo.Tasks.Task;
import com.harshita.toDo.Tasks.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		categoryRepository.deleteAll();
		ArrayList<Task> tasks=new ArrayList<>();
		tasks.add(new Task("1","discover","pay discover bill"));
		tasks.add(new Task("2","amex","pay amex bill"));
		tasks.add(new Task("3","rent","pay rent"));
		categoryRepository.save(new Category("finances",tasks));

		//taskRepository.save(new Task("2","food","grocery"));
		//taskRepository.save(new Task("3","misc","pack passport"));



		ArrayList<Task> tasks1=new ArrayList<>();
		tasks1.add(new Task("1","gym","go to gym 3 times a week"));
		tasks1.add(new Task("2","food","eat healthy"));
		//tasks.add(new Task("3","rent","pay rent"));
		categoryRepository.save(new Category("health",tasks1));






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
