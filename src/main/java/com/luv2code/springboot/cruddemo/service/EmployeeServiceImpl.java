package com.luv2code.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

	private EmployeeRepository theEmployeeRepository;
	
@Autowired
// define the default Qualifier DI because there are two Impl at this time
public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
	
this.theEmployeeRepository = theEmployeeRepository;
	}

	
	@Transactional

	public List<Employee> findAll() {
		
		return theEmployeeRepository.findAll();
	}

	
	@Transactional

	public Optional<Employee> findById(int theId) {
		
		return theEmployeeRepository.findById(theId);
	}

	
	@Transactional
	public void save(Employee theEmployee) {
		theEmployeeRepository.save(theEmployee);
		
	}

	
	@Transactional
	public void deleteById(int theId) {
		
		theEmployeeRepository.deleteById(theId);
	}

}
