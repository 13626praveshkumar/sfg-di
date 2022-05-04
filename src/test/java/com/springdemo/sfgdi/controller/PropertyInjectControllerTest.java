package com.springdemo.sfgdi.controller;

import com.springdemo.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {

    PropertyInjectController controller;

    @BeforeEach
    void setup()
    {
        controller=new PropertyInjectController();
        controller.greetingService=new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}