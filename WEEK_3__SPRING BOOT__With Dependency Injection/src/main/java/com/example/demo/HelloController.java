package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MessageService messageService;

    public HelloController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/")
    public String hello() {
        return messageService.getWelcomeMessage();
    }
}
