package com.example.jumia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jumia.entities.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends CrudRepository<Customer, Integer> {


}
