package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.CourseService;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @Autowired
    CourseService courseService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    // ✅ Get all courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getCourses();
    }

    // ✅ Get a course by ID
    @GetMapping("/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }
}
