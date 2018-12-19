package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "run 30 k";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getRandomDailyFortune() {
        return fortuneService.getFortune();
    }

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void doMyStartUpStuff(){
        System.out.println("start stuff");
    }
    public void doMyCleanUpStuff(){
        System.out.println("clean up stuff");
    }

}
