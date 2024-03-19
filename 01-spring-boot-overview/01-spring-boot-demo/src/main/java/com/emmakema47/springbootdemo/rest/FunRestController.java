package com.emmakema47.springbootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" to say "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
