package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

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

import com.luv2code.springboot.cruddemo.entity.Customer;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.CustomerService;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	
	private CustomerService customerService;
	
	// quick and dirty : injecting Employee dao (use constructor injection)
	@Autowired
	public CustomerRestController(CustomerService theCustomerService) {
		customerService = theCustomerService;
	}
	
	
	
	@GetMapping("/customers")
	public List<Customer> findAll(){

		
		 return customerService.findAll();
	}

//	@GetMapping("/customers/{customerId}")
//	public Customer getCustomer(@PathVariable int customerId){
//
//		Customer theCustomer= customerService.findById(customerId);
//		
//		if (theCustomer == null) {
//			throw new RuntimeException("Customer id not found: - " + customerId);
//		}
//		
//		return customerService.findById(customerId);
//
//	}
	
	// cregating new employee
	
//	@PostMapping("/customers")
//	public Customer addCustomer(@RequestBody Customer theCustomer){
//
//// also jsut incase they pass id in JSON ... set id to zero 0
//	// this is to inforc a save new item...insteade of 	update
//		
//		
//		theCustomer.setId(int theId);
//		
//		 customerService.save(theCustomer);
//		 
//		 return theCustomer;
//
//	}
	
	// add mapping for PUT/ employee- update existing employee
//	@PutMapping("/employees")
//	public Customer updateCustomer(@RequestBody Customer theCustomer){
//
//		customerService.save(theCustomer);
//		
//		
//		 return theCustomer;
//
//	}
	
	// add mapping for DELETE/ employee- of existing employee
//	@DeleteMapping("/customers/{customerId}")
//	public String updateCustomer(@PathVariable int customerId){
//
//		
//		Customer tempCustomer = customerService.findById(customerId);
//		
//		// throw exception if null
//		
//		if (tempCustomer == null) {
//			throw new RuntimeException("Customer id not found - " + customerId);
////			
////		}
//		
//		customerService.deleteById(customerId);
//		
//		return " Delete employee id - " + customerId;
//
//	}
	
}
