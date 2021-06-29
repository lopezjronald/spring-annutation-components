package com.steadfast.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton") // shared reference to the same bean
//@Scope("prototype") // creates a new instance everytime
public class TennisCoach implements Coach {

    // this will be SET the field by spring behind the scenes and inject the FortuneService by Java Reflections
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Tennis Coach no-args constructor");
    }

// Constructor Injection Example
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    // define init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("Inside 'doMyStartUpStuff'");
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("Inside 'doMyCleanUpStuff'");
    }

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
