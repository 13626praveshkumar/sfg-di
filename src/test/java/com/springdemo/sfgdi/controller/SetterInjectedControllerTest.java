package com.springdemo.sfgdi.controller;

import com.springdemo.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();
       controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        controller.sayGreeting();
    }
}