package com.haucktechnology.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haucktechnology.entities.Product;
import com.haucktechnology.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService userService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {

		List<Product> user = userService.findAll();

		return ResponseEntity.ok().body(user);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {

		Optional<Product> user = userService.findById(id);
		try {
			return ResponseEntity.ok().body(user);
			
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}

}
