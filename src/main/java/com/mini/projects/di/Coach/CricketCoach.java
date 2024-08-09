package com.mini.projects.di.Coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach  implements ICoach {

    public CricketCoach(){

    }

    @Override
    public String getDailyWorkout(){
        return "Play Cricket for 4 Hours.";
    }

}
