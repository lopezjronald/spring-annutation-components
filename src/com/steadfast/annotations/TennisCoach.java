package com.steadfast.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    // this will be SET the field by spring behind the scenes and inject the FortuneService by Java Reflections
    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Tennis Coach no-args constructor");
    }

// Constructor Injection Example
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your back-hand volley";
    }

    @Override
    public String getDailyChallenge() {
        return "100 suicide sprints!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    // Setter injection example
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Inside do crazy stuff tennis class");
//        this.fortuneService = fortuneService;
//    }

}
