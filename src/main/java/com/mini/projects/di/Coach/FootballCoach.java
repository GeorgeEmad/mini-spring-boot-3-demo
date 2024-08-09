package com.mini.projects.di.Coach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FootballCoach implements ICoach {

    public FootballCoach(){

    }

    @Override
    public String getDailyWorkout(){
        return "Play Football for 5 Hours.";
    }

}
