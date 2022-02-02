package com.haucktechnology.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haucktechnology.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
