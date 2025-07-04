package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getWelcomeMessage() {
        return "Welcome to Spring Boot with Dependency Injection!";
    }
}
