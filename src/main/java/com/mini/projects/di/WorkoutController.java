package com.mini.projects.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    private Coach coach;
    private Coach coach2;

    @Autowired
    public void setCoach2(Coach coach)
    {
        this.coach2 = coach;
    }

    @Autowired
    public WorkoutController(Coach Coach) {
        coach = Coach;
    }

    @GetMapping("/")
    public String getDailyWorkout(){
        return this.coach.getDailyWorkout();
    }

    @GetMapping("/setter")
    public String getDailyWorkout2(){
        return this.coach2.getDailyWorkout();
    }
}
