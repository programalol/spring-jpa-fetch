package com.jpajoinfetch.joinfetch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/say")
    public String sayHello(){
        return "Hi";
    }
}
