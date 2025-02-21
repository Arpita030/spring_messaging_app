package com.bridgelabz.restcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello") // 
public class HelloRestController {

    @GetMapping("/query") 
    public String sayHello(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
