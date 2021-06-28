package com.steadfast.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach, CoachType {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice your sprawls";
    }

    @Override
    public String getDailyChallenge() {
        return "150 Sprawls in less than 5 minutes";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public String getNutritionAdvice() {
        return "Eat lean meats, green carbs!";
    }

    @Autowired
    public String getCoachType(WrestlingCoach wrestlingCoach) {
        return wrestlingCoach.getClass().getSimpleName();
    }
}
