package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @GetMapping("/message")
    public String message() {
        return "Hello from BridgeLabz";
    }
}
