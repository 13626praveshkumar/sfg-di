package com.springdemo.sfgdi.controller;

import com.springdemo.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    GreetingService greetingService;

    public String sayHello()
    {
       return greetingService.sayGreeting();
    }

    public String getHello() {
        System.out.println("Hello world");
        return "hello";

    }
}