package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Boss {
    @GetMapping ("/myboss")
    public String getData(){
        return "my boss is out of control";
    }
}
