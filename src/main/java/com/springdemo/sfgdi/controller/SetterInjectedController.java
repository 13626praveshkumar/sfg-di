package com.springdemo.sfgdi.controller;

import com.springdemo.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    GreetingService greetingService;

    @Qualifier("setterInjectedGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting()
    {
        return greetingService.sayGreeting();
    }


}
