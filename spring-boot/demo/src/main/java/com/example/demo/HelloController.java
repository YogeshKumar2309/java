package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
    
    @GetMapping("")
    public String hello() {
        return "<h1>hello world</h1>";
    }
}
