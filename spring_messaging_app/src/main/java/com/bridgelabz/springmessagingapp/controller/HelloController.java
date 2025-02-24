package com.bridgelabz.springmessagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET method to return Hello message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // POST method
    @PostMapping
    public String postHello() {
        return "Hello via POST request!";
    }

    // PUT method
    @PutMapping
    public String putHello() {
        return "Hello via PUT request!";
    }

    // DELETE method
    @DeleteMapping
    public String deleteHello() {
        return "Hello via DELETE request!";
    }
}
