package com.praga.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/favoritecolor")
    public String studentName(@RequestParam String color) {
        return "My favorite color is "+color+'!';
    }

}
