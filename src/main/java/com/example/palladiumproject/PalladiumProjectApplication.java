package com.example.palladiumproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3002", maxAge = 3600)
@SpringBootApplication
public class PalladiumProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalladiumProjectApplication.class, args);
    }

}
