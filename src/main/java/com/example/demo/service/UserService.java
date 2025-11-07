package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.UserRepository;

@Component
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
