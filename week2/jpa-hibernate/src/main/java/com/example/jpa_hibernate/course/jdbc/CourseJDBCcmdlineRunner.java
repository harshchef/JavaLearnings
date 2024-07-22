package com.example.jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJDBCcmdlineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepo repo;

    @Override
    public void run(String... args) throws Exception {
//        repo.insert(new Course(88, "w", "8"));
//
//        // Insert a new course
//        repo.insert(new Course(86, "Spring Boot", "John Doe"));
//
//        // Update the course
//        repo.update(new Course(87, "Spring Boot 2.0", "Jane Doe"));
//
//        // Delete the course
//        repo.delete(88);
//
//        // Insert another course to verify
//        repo.insert(new Course(89, "Hibernate", "Paul Smith"));
//
//
//        System.out.println(repo.findbyID(89));
        // TODO Auto-generated method stub
     //   throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
