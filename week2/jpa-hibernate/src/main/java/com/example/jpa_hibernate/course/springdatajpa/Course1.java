package com.example.jpa_hibernate.course.springdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Entity
@Transactional
public class Course1 {
    @Id
    private Long id;
    private String name;
    private String author;

    public Course1() {
    }

    public Course1(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
