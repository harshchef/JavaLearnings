// package com.example.demo;

// import java.util.Arrays;
// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.courses.Course;


// @RestController
// public class CourseController {

//     @GetMapping("/helloword")
//     public String getMethodName() {
//         return new  String("hello world");
//     }
    
//     @GetMapping("/courses")
//     public List<Course> getAllCourse() {
//         return Arrays.asList(new Course(1, "sacnull","cscc"));
//     }
    
// }
package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.courses.Course;

@RestController
public class CourseController {

    private List<Course> courses = new ArrayList<>(Arrays.asList(
        new Course(1, "Spring Framework", "Spring Framework Description"),
        new Course(2, "Java Basics", "Java Basics Description"),
        new Course(3, "Python for Beginners", "Python for Beginners Description")
    ));

    @GetMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello World";
    }
    
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courses;
    }
   
    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable int id) {
        Optional<Course> course = courses.stream().filter(c -> c.getId() == id).findFirst();
        return course.orElse(null);  // Return null if course is not found (for simplicity)
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course) {
        courses.add(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable int id, @RequestBody Course updatedCourse) {
        for (int i = 0; i < courses.size(); i++) {
            Course c = courses.get(i);
            if (c.getId() == id) {
                courses.set(i, updatedCourse);
                return;
            }
        }
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable int id) {
        courses.removeIf(c -> c.getId() == id);
    }
}

