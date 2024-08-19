package com.mini.projects.di.config;

import com.mini.projects.di.coach.ICoach;
import com.mini.projects.di.coach.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean
    public ICoach swimmingCoach(){
        return new SwimCoach();
    }
}
