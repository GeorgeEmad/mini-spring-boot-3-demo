package com.mini.projects.di.controllers;

import com.mini.projects.di.coach.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    private ICoach footballCoach;
    private ICoach tennisCoach;
    private ICoach swimCoach;

    @Autowired
    public WorkoutController(ICoach coach, @Qualifier("swimmingCoach")ICoach swimCoach) {
        this.footballCoach = coach;
        this.swimCoach = swimCoach;
    }

    @Autowired
    @Qualifier("tennisCoach")
    public void setTennisCoach(ICoach coach)
    {
        this.tennisCoach = coach;
    }

    @GetMapping("/")
    public String getDailyWorkoutFootball(){
        return this.footballCoach.getDailyWorkout();
    }

    @GetMapping("/tennis")
    public String getDailyWorkoutTennis(){
        return this.tennisCoach.getDailyWorkout();
    }

    @GetMapping("/swim")
    public String getDailyWorkoutSwim(){
        return this.swimCoach.getDailyWorkout();
    }
}
