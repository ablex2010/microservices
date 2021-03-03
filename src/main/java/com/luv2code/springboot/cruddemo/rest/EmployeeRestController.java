package com.luv2code.springboot.cruddemo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	
	private EmployeeService employeeService;
	
	// quick and dirty : injecting Employee dao (use constructor injection)
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	
	
	@GetMapping("/employees")
	public List<Employee> findAll(){

		return employeeService.findAll();
	}

	@GetMapping("/employees/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable int employeeId){

		Optional<Employee> theEmployee = employeeService.findById(employeeId);
		
		if (theEmployee == null) {
			throw new RuntimeException("Employee id not found: - " + employeeId);
		}
		
		return employeeService.findById(employeeId);

	}
	
	// cregating new employee
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee){

// also jsut incase they pass id in JSON ... set id to zero 0
	// this is to inforc a save new item...insteade of 	update
		
		
		theEmployee.setId(0);
		
		 employeeService.save(theEmployee);
		 
		 return theEmployee;

	}
	
	// add mapping for PUT/ employee- update existing employee
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee){

		employeeService.save(theEmployee);
		
		
		 return theEmployee;

	}
	
	// add mapping for DELETE/ employee- of existing employee
	@DeleteMapping("/employees/{employeeId}")
	public String updateEmployee(@PathVariable int employeeId){

		
		Optional<Employee> tempEmployee = employeeService.findById(employeeId);
		
		// throw exception if null
		
		if (tempEmployee == null) {
			throw new RuntimeException("Employee id not found - " + employeeId);
			
		}
		
		employeeService.deleteById(employeeId);
		
		return " Delete employee id - " + employeeId;

	}
	
}
