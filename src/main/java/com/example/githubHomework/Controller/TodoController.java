package com.example.githubHomework.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String getPage() {
        return "To-Do Application!";
    }
}
