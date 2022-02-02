package com.haucktechnology.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haucktechnology.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
