package com.lisa.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.lisa.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
