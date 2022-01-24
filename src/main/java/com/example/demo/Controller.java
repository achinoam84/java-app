package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    String hello() {
        return "Hello, world! I'm fucking yaml-developer!";
    }
}
