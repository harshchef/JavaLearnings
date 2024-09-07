package com.example.SpringOauth2Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @GetMapping()
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/home")
    public String homePage() {
        return "Welcome to the Home Page!";
    }

    @GetMapping("/contact-us")
    public String contactUsPage() {
        return "This is the Contact Us page.";
    }
}
