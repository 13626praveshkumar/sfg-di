package com.springdemo.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean()
    {
        System.out.println("I am a Singleton Bean!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public String getMyScope()
    {
        return "I am a Singleton";
    }
}
