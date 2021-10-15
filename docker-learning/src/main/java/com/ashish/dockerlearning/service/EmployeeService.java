package com.ashish.dockerlearning.service;

import java.util.List;

import com.ashish.dockerlearning.domain.Employee;

public interface EmployeeService {
	
	Employee get(Integer empId);
	List<Employee> getAll();
	boolean save();

}
