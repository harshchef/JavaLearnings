package com.example.shed;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ShedApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShedApplication.class, args);
    }


}
