package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mari {
    @GetMapping ("/mybook")
    public String getData(){
        return "pls book your book";
    }
}
