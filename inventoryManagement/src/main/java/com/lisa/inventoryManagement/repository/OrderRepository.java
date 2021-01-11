package com.lisa.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.lisa.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
