package com.ashish.dockerlearning.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

@Document("employee")
public class Employee {

	@Id
	private Integer empid;
	private String employeeName;
	private Integer salary;
	
	Employee(){
		
	}
	
	public Employee(Integer empid, String employeeName, Integer salary) {
		super();
		Assert.notNull(empid, "Employee Id cannot be null");
		Assert.notNull(employeeName, "name cannot be null");
		Assert.notNull(salary, "Salary cannot be null");
		
		this.empid = empid;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	
}
