package com.steadfast.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of Strings
    private final String[] randomFortunes = {"Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"};

    // create random number generator
    private final Random myRandomNumber = new Random();

    @Override
    public String getFortune() {
        return randomFortunes[myRandomNumber.nextInt(randomFortunes.length)];
    }
}
