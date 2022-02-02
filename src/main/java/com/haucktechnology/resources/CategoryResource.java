package com.haucktechnology.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haucktechnology.entities.Category;
import com.haucktechnology.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {

		List<Category> user = categoryService.findAll();

		return ResponseEntity.ok().body(user);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {

		Optional<Category> user = categoryService.findById(id);
		try {
			return ResponseEntity.ok().body(user);
			
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}

}
