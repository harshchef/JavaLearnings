package com.example.jpa_hibernate.course.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseJPArepo {

    @PersistenceContext
    private EntityManager entityManager;

    public void insertJPA(Course c) {


            entityManager.merge(c); // Use merge for existing entities

    }

    public Course findbyId(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deletebyId(long id) {
        Course c = entityManager.find(Course.class, id);
        if (c != null) {
            entityManager.remove(c);
        }
    }
}
