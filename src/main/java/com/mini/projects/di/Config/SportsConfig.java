package com.mini.projects.di.Config;

import com.mini.projects.di.Coach.ICoach;
import com.mini.projects.di.Coach.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean
    public ICoach swimmingCoach(){
        return new SwimCoach();
    }
}
