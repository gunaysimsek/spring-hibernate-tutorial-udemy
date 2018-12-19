package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = coach == alphaCoach;
        boolean result2 = coach.equals(alphaCoach);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(coach);
        System.out.println(alphaCoach);



    }

}
