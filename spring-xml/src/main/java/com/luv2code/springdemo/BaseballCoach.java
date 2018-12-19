package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "shoot 30";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

    @Override
    public String getRandomDailyFortune() {
        return fortuneService.getFortune();
    }

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
}
