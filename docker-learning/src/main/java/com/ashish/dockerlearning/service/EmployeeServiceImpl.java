package com.ashish.dockerlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.dockerlearning.domain.Employee;
import com.ashish.dockerlearning.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeServiceImpl(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee get(Integer empId) {
		return employeeRepository.findItemById(empId);
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public boolean save() {
		employeeRepository.save(new Employee(1, "Ashish Bhardwaj", 1000));
		employeeRepository.save(new Employee(2, "John Dere", 2000));
		employeeRepository.save(new Employee(3, "Grover", 45000));
		return true;
	}
	
	
	
	

	
}
