package com.example.jpa_hibernate.course.restapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseRestApiJpaController {

    @Autowired
    private CouseApiJPAdatarepo repository;

    // Create a new course
    @PostMapping
    public ResponseEntity<Course3> createCourse(@RequestBody Course3 course) {
        Course3 savedCourse = repository.save(course);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }

    // Get a course by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Course3> getCourseById(@PathVariable Long id) {
//        Optional<Course3> course = repository.findById(id);
//        return course.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }

    // Get all courses
    @GetMapping
    public List<Course3> getAllCourses() {
        return repository.findAll();
    }

    // Update a course
    @PutMapping("/{id}")
    public ResponseEntity<Course3> updateCourse(@PathVariable Long id, @RequestBody Course3 course) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        course.setId(id);
        Course3 updatedCourse = repository.save(course);
        return ResponseEntity.ok(updatedCourse);
    }

    // Delete a course
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Course3 getcoursebyid(@PathVariable long id)
    {
       Optional<Course3> c=repository.findById(id);
       if(c.isEmpty())
            throw new RuntimeException();
        return c.get();
    }
}
