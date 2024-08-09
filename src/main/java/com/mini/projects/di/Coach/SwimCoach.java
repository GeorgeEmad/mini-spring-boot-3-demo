package com.mini.projects.di.Coach;

import org.springframework.stereotype.Component;

public class SwimCoach implements ICoach {

    @Override
    public String getDailyWorkout(){
        return "Swim for 2 Hours.";
    }

}
