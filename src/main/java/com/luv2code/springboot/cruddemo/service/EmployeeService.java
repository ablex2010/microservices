package com.luv2code.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import com.luv2code.springboot.cruddemo.entity.Employee;


public interface EmployeeService {

	public List<Employee> findAll();
	
	public Optional<Employee> findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	
	
	
}
