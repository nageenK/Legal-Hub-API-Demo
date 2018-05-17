package com.javasampleapproach.legalhubapi.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.legalhubapi.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}