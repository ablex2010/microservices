package com.luv2code.springboot.cruddemo.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.luv2code.springboot.cruddemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
