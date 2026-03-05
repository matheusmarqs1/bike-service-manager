package com.matheusmarqs1.bike_service_manager.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusmarqs1.bike_service_manager.entities.Customer;
import com.matheusmarqs1.bike_service_manager.repositories.CustomerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {
		Customer customer1 = new Customer(null, "Renato", "00000000000", "renato@example.com", "99999999", "Aparecida de Goiânia");
		Customer customer2 = new Customer(null, "Ronaldo Rosa", "00000000001", "ronaldo@example.com", "99999998", "Aparecida de Goiânia");
		
		customerRepository.saveAll(Arrays.asList(customer1, customer2));
		
		
	}

}
