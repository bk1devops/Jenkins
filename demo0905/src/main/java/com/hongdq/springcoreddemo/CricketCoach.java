package com.hongdq.springcoreddemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Hello lop dev ops" ;
    }
}
