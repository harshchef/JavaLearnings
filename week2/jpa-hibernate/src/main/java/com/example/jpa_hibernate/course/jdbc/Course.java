package com.example.jpa_hibernate.course.jdbc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class Course {

private long id;

private String name;
private String Author;

public Course(long id, String name, String author) {
   
   super();
   
    this.id = id;
    this.name = name;
    Author = author;
}
public Course() {
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
