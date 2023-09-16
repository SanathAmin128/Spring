package com.javaguides.firstSpring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    //inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    //expose new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+coachName+" , Team name: "+teamName;
    }

    @GetMapping("/")
    public String say(){
        return "Hello World.You'll be placed soon";
    }

    @GetMapping("/work")
    public String getDaily(){
        return "run fast and steady";
    }

}
