package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        CricketCoach theCoach2 = context.getBean("myCoach2", CricketCoach.class);
        System.out.println(theCoach2.getDailyWorkout());
        System.out.println(theCoach2.getDailyFortune());
        System.out.println(theCoach2.getEmailAdress());
        System.out.println(theCoach2.getTeam());

        context.close();


    }
}
