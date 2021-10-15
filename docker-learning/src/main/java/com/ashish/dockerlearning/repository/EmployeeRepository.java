package com.ashish.dockerlearning.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ashish.dockerlearning.domain.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{
	
	@Query("{empid:?0}")
	Employee findItemById(Integer empid);
	
	@Override
	List<Employee> findAll();

}
