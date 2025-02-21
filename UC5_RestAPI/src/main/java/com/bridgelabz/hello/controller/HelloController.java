package com.bridgelabz.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
    @GetMapping("/put/{firstName}")
    public String testHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello, " + firstName + " " + lastName + " from BridgeLabz!";
    }
    
}
