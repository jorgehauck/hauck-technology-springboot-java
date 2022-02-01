package com.haucktechnology.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haucktechnology.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	
}
