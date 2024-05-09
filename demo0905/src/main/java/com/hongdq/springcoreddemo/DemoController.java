package com.hongdq.springcoreddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/gettext")
    public String getDalyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
