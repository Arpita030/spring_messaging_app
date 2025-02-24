package com.bridgelabz.springmessagingapp.controller;

import org.springframework.web.bind.annotation.*;

import com.bridgelabz.springmessagingapp.userDTO.UserDTO;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET method to return Hello message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    
 // POST method to receive firstName and lastName in request body
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
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
    
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
    // DELETE method
    @DeleteMapping
    public String deleteHello() {
        return "Hello via DELETE request!";
    }
    
}
