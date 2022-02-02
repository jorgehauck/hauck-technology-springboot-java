package com.haucktechnology.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haucktechnology.entities.Order;
import com.haucktechnology.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService userService;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {

		List<Order> user = userService.findAll();

		return ResponseEntity.ok().body(user);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Order>> findById(@PathVariable Long id) {

		Optional<Order> user = userService.findById(id);
		try {
			return ResponseEntity.ok().body(user);
			
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}

}
