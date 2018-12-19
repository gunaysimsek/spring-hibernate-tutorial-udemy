package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Beware of",
            "Diligince is",
            "The journey is"
    };
    private Random random = new Random();


    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
