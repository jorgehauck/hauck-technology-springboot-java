package com.haucktechnology.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haucktechnology.entities.Product;
import com.haucktechnology.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository userRepository;

	public List<Product> findAll() {
		List<Product> user = userRepository.findAll();
		return user;
	}
	
	public Optional<Product> findById(Long id) {
		Optional<Product> user = userRepository.findById(id);
		return user;
	}
}
