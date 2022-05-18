package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @GetMapping("/message")
    public String message() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" from Bridgelabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+" from Bridgelabz";
    }

    @PostMapping("/post")
    public String userData(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " " +"from BridgeLabz";}
}

