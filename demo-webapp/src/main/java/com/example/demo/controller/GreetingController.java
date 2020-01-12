package com.example.demo.controller;

import com.example.demo.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GreetingController {
    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting("Hello, World");
    }
}