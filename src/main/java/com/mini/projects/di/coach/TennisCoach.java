package com.mini.projects.di.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

    public TennisCoach(){

    }

    @Override
    public String getDailyWorkout(){
        return "Play Tennis for 6 Hours.";
    }

}
