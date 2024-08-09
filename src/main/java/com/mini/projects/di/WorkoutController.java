package com.mini.projects.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    private Coach coach;

    @Autowired
    public WorkoutController(Coach Coach) {
        coach = Coach;
    }

    @GetMapping("/")
    public String getDailyWorkout(){
        return this.coach.getDailyWorkout();
    }

    @GetMapping("/test")
    public String getDailyWorko(){
        return "test";
    }
}
