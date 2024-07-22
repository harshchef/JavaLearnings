package com.example.jpa_hibernate.course.springdatajpa;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringdatajpaRepo extends  JpaRepository <Course1,Long>{
List<Course1> findByAuthor(String author);
List<Course1> findByName(String name);

}
