package com.matheusmarqs1.bike_service_manager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusmarqs1.bike_service_manager.entities.Customer;
import com.matheusmarqs1.bike_service_manager.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> findAll(){
		return repository.findAll();
	}
	
	public Customer findById(Long id) {
		return repository.findById(id).get();
	}
}
