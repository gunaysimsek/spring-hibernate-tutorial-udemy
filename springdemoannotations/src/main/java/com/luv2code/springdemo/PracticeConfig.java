package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfig {

    @Bean
    public PracticeFortune practiceFortune(){
        return new PracticeFortune();
    }
    @Bean
    public Coach footballCoach(){
        return  new FootballCoach(practiceFortune());
    }
}
