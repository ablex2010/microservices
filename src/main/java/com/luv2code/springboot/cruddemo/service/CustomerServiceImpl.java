package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.CustomerRepository;
import com.luv2code.springboot.cruddemo.entity.Customer;
import com.luv2code.springboot.cruddemo.entity.Employee;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
@Autowired
// define the default Qualifier DI because there are two Impl at this time
	public CustomerServiceImpl(@Qualifier("customerRepository") CustomerRepository TheCustomerRepository) {
//	public CustomerServiceImpl(customerRepository customerRepository) {

	customerRepository = TheCustomerRepository;
	}

	@Override
//	@Transactional
	public List<Customer> findAll() {
		
		return (List<Customer>) customerRepository.findAll();
	}

//	@Override 
//	@Transactional
//	public Customer findById(int theId) {
//		
//		return customerRepository.findById(theId);
//	}

//	@Override
//	@Transactional
//	public void save(Customer theCustomer) {
//		customerRepository.save(theCustomer);
//		
//	}

//	@Override
//	@Transactional
//	public void deleteById(int theId) {
//		
//		customerRepository.deleteById(theId);
//	}

}
