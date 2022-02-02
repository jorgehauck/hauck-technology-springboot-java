package com.haucktechnology.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haucktechnology.entities.Category;
import com.haucktechnology.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> findAll() {
		List<Category> user = categoryRepository.findAll();
		return user;
	}
	
	public Optional<Category> findById(Long id) {
		Optional<Category> user = categoryRepository.findById(id);
		return user;
	}
}
