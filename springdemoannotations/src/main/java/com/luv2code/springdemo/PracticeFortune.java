package com.luv2code.springdemo;

public class PracticeFortune implements  FortuneService {
    @Override
    public String getFortune() {
        return "practice fortune";
    }
}
