package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach",Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

        boolean result = (coach == alphaCoach);
        System.out.println(result);
        System.out.println("memory for coach" + coach);
        System.out.println("memory for alpha coach" + alphaCoach);

    }
}
