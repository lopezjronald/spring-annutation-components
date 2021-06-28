package com.steadfast.annotations;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        WrestlingCoach wrestlingCoach = context.getBean("wrestlingCoach", WrestlingCoach.class);

        // call injected autowired fortune from TennisCoach
        System.out.println(tennisCoach.getDailyFortune());

        // call a method on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyChallenge());
        System.out.println(wrestlingCoach.getDailyWorkout());
        System.out.println(wrestlingCoach.getNutritionAdvice());
        System.out.println(wrestlingCoach.getCoachType(wrestlingCoach));

        // close the context
        context.close();
    }
}
