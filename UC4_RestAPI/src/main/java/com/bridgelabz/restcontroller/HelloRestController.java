package com.bridgelabz.restcontroller;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.dto.UserDTO; // Make sure this class exists in the correct package

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello, " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }

    @GetMapping("/greet/{firstName}")
    public String testGreeting(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello, " + firstName + " " + lastName + " from BridgeLabz!";
    }
}
