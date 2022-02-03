package com.haucktechnology.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haucktechnology.entities.User;
import com.haucktechnology.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		List<User> user = userRepository.findAll();
		return user;
	}

	public Optional<User> findById(Integer id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	
}
