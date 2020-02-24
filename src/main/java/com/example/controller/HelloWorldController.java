package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/index")
    public  String index(@RequestParam(value = "name", defaultValue = "word") String name) {
        return  String.format("hello %s", name);
    }
}
