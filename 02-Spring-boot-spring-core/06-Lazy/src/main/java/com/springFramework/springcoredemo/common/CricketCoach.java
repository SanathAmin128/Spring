package com.springFramework.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component   //if component found then this class will be treated as bean
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 3 minutes";
    }
}
