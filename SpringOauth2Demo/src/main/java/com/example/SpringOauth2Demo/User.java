package com.example.SpringOauth2Demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Document("User")
@Data
@NoArgsConstructor
@AllArgsConstructor
 public class User {

    @Id
    private String id;
    private String name;
    private int age;

  
}