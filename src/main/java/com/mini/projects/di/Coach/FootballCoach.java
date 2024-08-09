package com.mini.projects.di.Coach;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements ICoach {

    public FootballCoach(){

    }

    @Override
    public String getDailyWorkout(){
        return "Play Football for 5 Hours.";
    }

}
