package com.ashish.dockerlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ashish.dockerlearning.controller.EmployeeController;
import com.ashish.dockerlearning.domain.Employee;
import com.ashish.dockerlearning.service.EmployeeService;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@ComponentScan(basePackageClasses = {EmployeeController.class, EmployeeService.class, Employee.class})
@EnableMongoRepositories("com.ashish.dockerlearning.repository")
public class DockerLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerLearningApplication.class, args);
	}

}
