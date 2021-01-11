package com.lisa.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.lisa.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
