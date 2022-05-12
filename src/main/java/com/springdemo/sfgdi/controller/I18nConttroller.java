package com.springdemo.sfgdi.controller;

import com.springdemo.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Implementing Profile
@Controller
public class I18nConttroller {
    GreetingService greetingService;

    @Autowired
    public I18nConttroller(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        return  greetingService.sayGreeting();
    }


}
