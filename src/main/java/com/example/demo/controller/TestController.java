package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/first")
    public String first() {
        return "first route update - 2";
    }

    @GetMapping("/second")
    public String second() {
        return "second route update - 2";
    }

    @GetMapping("/third")
    public String third() {
        return "third route update - 2";
    }
}
