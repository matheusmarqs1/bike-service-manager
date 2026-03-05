package com.matheusmarqs1.bike_service_manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusmarqs1.bike_service_manager.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
