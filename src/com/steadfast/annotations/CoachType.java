package com.steadfast.annotations;

import org.springframework.stereotype.Component;

@Component
public interface CoachType {

    String getCoachType(WrestlingCoach wrestlingCoach);
}
