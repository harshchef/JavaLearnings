package com.example.jpa_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Springdatajpacmdrunner implements CommandLineRunner {

    @Autowired
    private CourseSpringdatajpaRepo repo;
    @Override
    public void run(String... args) throws Exception {
      //   Insert a new course with auto-generated ID
        repo.save(new Course1(1L,"Spring Boot", "John Doe"));

        // Insert another course
        repo.save(new Course1(2L,"Hibernate", "Paul Smith"));

        // Delete the course
//        repo.deleteById(2L); // Make sure the ID is of type Long

        // Retrieve and print the course
System.out.println("hi");
        System.out.println("Course Retrieved: " + repo.findById(1L));
        List<Course1> coursesByAuthor = repo.findByAuthor("John Doe");
        System.out.println("Courses by Author 'John Doe': " + coursesByAuthor);

        // Find and print courses by name
        List<Course1> coursesByName = repo.findByName("Spring Boot");
        System.out.println("Courses with Name 'Spring Boot': " + coursesByName);

    }
}
