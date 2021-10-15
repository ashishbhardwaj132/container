package com.ashish.dockerlearning.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.dockerlearning.domain.Employee;
import com.ashish.dockerlearning.service.EmployeeService;

@RestController
@RequestMapping("/api/")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	EmployeeController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}
	
	@GetMapping("/init")
	public String init() {
		employeeService.save();
		return "Employee Initialized";
	}
	
	@GetMapping("/get/{empid}")
	public Employee getData(@PathVariable Integer empid) {
		System.out.println("Getting data for Employee Id : " + empid);
		return employeeService.get(empid);
	}
	
	@GetMapping("/getAll")
	public Collection<Employee> getDataAll() {
		System.out.println("Getting data for All Employee");
		return employeeService.getAll();
	}

}
