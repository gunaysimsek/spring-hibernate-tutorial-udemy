package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements  FortuneService {

    private String[] fortuneArray =
            {"Happy", "Bad", "Soso"};
    private Random randomGenerator = new Random();
    @Override
    public String getFortune() {

        return fortuneArray[randomGenerator.nextInt(fortuneArray.length)];
    }
}
