package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Component
public class CourseService {
	

	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> getCourses() {
		return courseRepository.findAll();
	}
	
	public Optional<Course> getCourseById(int id) {
		return courseRepository.findById(id);
	}

}
