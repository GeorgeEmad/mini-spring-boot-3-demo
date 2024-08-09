package com.mini.projects.di;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach  implements Coach{

    public CricketCoach(){

    }

    @Override
    public String getDailyWorkout(){
        return "Play Cricket for 4 Hours.";
    }

}
