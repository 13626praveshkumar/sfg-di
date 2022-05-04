package com.springdemo.sfgdi.controller;

import com.springdemo.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void sayGreeting()
    {
        controller.sayHello();
    }
}