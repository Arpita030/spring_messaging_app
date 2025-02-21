package com.bridgelabz.restcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
