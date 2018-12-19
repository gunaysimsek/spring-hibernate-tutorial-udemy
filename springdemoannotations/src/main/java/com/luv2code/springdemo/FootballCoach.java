package com.luv2code.springdemo;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "shoot 30 times";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
