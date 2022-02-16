package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/myrest/hello")
    public  String hello(){
    return ("rest api trial from getting path from the path below");

    }
}
