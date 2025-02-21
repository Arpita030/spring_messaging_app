package com.bridgelabz.restcontroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello") 
public class HelloRestController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
