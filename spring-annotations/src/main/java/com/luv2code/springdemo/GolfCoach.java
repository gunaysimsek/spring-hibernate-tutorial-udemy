package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "play more golf";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
