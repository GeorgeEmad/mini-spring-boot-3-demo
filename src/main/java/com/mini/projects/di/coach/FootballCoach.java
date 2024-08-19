package com.mini.projects.di.coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Primary
@Component
public class FootballCoach implements ICoach {

    @PostConstruct
    public void postContruct(){
        System.out.println("Football Post Contruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Football Pre Destroy");
    }

    @Override
    public String getDailyWorkout(){
        return "Play Football for 5 Hours.";
    }

}
