package com.example.jpa_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Coursejpacmdrunner implements CommandLineRunner {

    @Autowired
    private CourseJPArepo repo;

    @Override
    public void run(String... args) throws Exception {
//        // Insert a new course with auto-generated ID
//        repo.insertJPA(new Course("Spring Boot", "John Doe"));
//
//        // Insert another course
//        repo.insertJPA(new Course("Hibernate", "Paul Smith"));
//
//        // Delete the course
//        repo.deletebyId(88L); // Make sure the ID is of type Long
//
//        // Retrieve and print the course
//        Course course = repo.findbyId(89L); // Make sure the ID is of type Long
//        System.out.println("Course Retrieved: " + course);
    }
}
