package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import com.example.demo.student.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/student")
public class Controller {
    @GetMapping("/list")
    public List<student> list(){
        List<student> result = new ArrayList<>();
        student s1 = new student();
        s1.setId(1);
        s1.setName("Jack");
        s1.setAge(19);
        student s2 = new student();
        s2.setId(1);
        s2.setName("Anna");
        s2.setAge(20);
        result.add(s1);
        result.add(s2);
        return result;
    }

    @GetMapping("/get")
    public student get(@RequestParam("id") Integer id) {
        student s1 = new student();
        s1.setId(1);
        s1.setName("Jack");
        s1.setAge(19);
        return s1;
    }

    @PostMapping("/add")
    public Integer add(){
        return 0;
    }

    //todo
}
