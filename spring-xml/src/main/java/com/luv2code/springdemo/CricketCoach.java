package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAdress;
    private String team;

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "hit 30 k";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getRandomDailyFortune() {
        return fortuneService.getFortune();
    }

    public CricketCoach(){
        System.out.println("Cricket Coach no arg constr");
    }
}
