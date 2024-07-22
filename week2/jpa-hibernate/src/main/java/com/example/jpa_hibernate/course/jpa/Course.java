package com.example.jpa_hibernate.course.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Entity
@Transactional
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
    private Long id;

    private String name;
    private String author;

    // Constructor with all fields
    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Constructor without ID (for new entities)
    public Course(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
}
