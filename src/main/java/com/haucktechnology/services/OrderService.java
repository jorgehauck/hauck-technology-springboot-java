package com.haucktechnology.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haucktechnology.entities.Order;
import com.haucktechnology.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		List<Order> user = orderRepository.findAll();
		return user;
	}
	
	public Optional<Order> findById(Long id) {
		Optional<Order> user = orderRepository.findById(id);
		return user;
	}
}
