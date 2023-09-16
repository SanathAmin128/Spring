package com.springFramework.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component   //if component found then this class will be treated as bean
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 30 minutes";
    }
}
