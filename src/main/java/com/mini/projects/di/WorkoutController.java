package com.mini.projects.di;

import com.mini.projects.di.Coach.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    private ICoach coach;
    private ICoach coach2;

    @Autowired
    public WorkoutController(ICoach Coach) {
        coach = Coach;
    }

    @Autowired
    @Qualifier("tennisCoach")
    public void setCoach2(ICoach coach)
    {
        this.coach2 = coach;
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
