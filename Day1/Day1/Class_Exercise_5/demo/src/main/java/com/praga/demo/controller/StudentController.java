package com.praga.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.praga.demo.model.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> rev() {
        List<Student> l = new ArrayList<>();
        l.add(new Student("John", "Welcome, John!"));
        return l;
    }

}
