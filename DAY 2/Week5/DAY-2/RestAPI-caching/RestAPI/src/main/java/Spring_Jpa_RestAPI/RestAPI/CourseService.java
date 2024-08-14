package Spring_Jpa_RestAPI.RestAPI;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);

    @Cacheable(cacheNames = "courses")
    public List<Course> getAllCourses() {
        logger.trace("Log level: TRACE - Entering getAllCourses method");
        logger.info("Log level: INFO - Fetching all courses from the database");
        logger.debug("Log level: DEBUG - About to call repository.findAll()");
        List<Course> courses = repository.findAll();
        logger.debug("Log level: DEBUG - Fetched courses: " + courses);
        logger.trace("Log level: TRACE - Exiting getAllCourses method");
        return courses;
    }

    @Cacheable(cacheNames = "course", key = "#id")
    public Course getCourseById(long id) {
        logger.trace("Log level: TRACE - Entering getCourseById method");
        logger.info("Log level: INFO - Fetching course from the database based on id: " + id);
        logger.debug("Log level: DEBUG - About to call repository.findById(id)");
        Optional<Course> course = repository.findById(id);
        if (course.isEmpty()) {
            logger.error("Log level: ERROR - Course not found with id: " + id);
            throw new RuntimeException("Course not found with id: " + id);
        }
        logger.debug("Log level: DEBUG - Fetched course: " + course.get());
        logger.trace("Log level: TRACE - Exiting getCourseById method");
        return course.get();
    }

    @CachePut(cacheNames = "courseAdd")
    public void addCourse(Course course) {
        logger.trace("Log level: TRACE - Entering addCourse method");
        logger.info("Log level: INFO - Adding course to the database: " + course);
        logger.debug("Log level: DEBUG - About to call repository.save(course)");
        repository.save(course);
        logger.trace("Log level: TRACE - Exiting addCourse method");
    }

    @CachePut(cacheNames = "coursePut", key = "#id")
    public void updateCourse(long id, Course course) {
        logger.trace("Log level: TRACE - Entering updateCourse method");
        logger.info("Log level: INFO - Updating course details in the database for id: " + id);
        logger.debug("Log level: DEBUG - About to call repository.save(course)");
        repository.save(course);
        logger.trace("Log level: TRACE - Exiting updateCourse method");
    }

    @CacheEvict(cacheNames = "courseDelete", key = "#id")
    public void deleteCourse(long id) {
        logger.trace("Log level: TRACE - Entering deleteCourse method");
        logger.info("Log level: INFO - Deleting course from the database with id: " + id);
        logger.debug("Log level: DEBUG - About to call repository.deleteById(id)");
        repository.deleteById(id);
        logger.warn("Log level: WARN - Course deleted with id: " + id);
        logger.trace("Log level: TRACE - Exiting deleteCourse method");
    }
}
