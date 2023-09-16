package com.springFramework.springcoredemo.config;

import com.springFramework.springcoredemo.common.Coach;
import com.springFramework.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
