package com.me.taskvault;

import com.me.taskvault.models.Person;
import com.me.taskvault.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskvaultApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PersonRepository personRepository) {
		return args -> {

			Person personOne = new Person("Daniel", "Rodado", 18);
			personRepository.save(personOne);

		};
	}

}
