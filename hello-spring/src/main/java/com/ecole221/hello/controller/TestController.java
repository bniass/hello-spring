package com.ecole221.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping
    public String index(){
        return "Hello";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello version 1.2";
    }
}
