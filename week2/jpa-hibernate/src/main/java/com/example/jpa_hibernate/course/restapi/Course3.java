package com.example.jpa_hibernate.course.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Entity
@Transactional
public class Course3 {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String Author;

    public Course3(long id, String name, String author) {

        super();

        this.id = id;
        this.name = name;
        Author = author;
    }
    public Course3() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", Author=" + Author + "]";
    }


}
