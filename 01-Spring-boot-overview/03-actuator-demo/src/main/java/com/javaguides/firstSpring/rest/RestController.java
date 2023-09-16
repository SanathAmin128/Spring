package com.javaguides.firstSpring.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String say(){
        return "Hello World.You'll be placed soon";
    }

    @GetMapping("/work")
    public String getDaily(){
        return "run fast and steady";
    }

}
