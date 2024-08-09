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
    @Qualifier("tennisCoach")
    public void setCoach2(ICoach coach)
    {
        this.coach2 = coach;
    }

    @Autowired
    public WorkoutController(@Qualifier("footballCoach") ICoach Coach) {
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
