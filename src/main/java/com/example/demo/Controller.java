package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/super_app")
    String super_app() {
        return "Hello, world! I'm fucking yaml-developer!";
    }
}
