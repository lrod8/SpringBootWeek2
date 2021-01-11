package com.lisa.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.lisa.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
