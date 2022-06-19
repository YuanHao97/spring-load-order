package com.example.spring.load.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class FilterController {
    @RequestMapping("hello")
    public Object helloWorld() {
        return "Hello";
    }
}
