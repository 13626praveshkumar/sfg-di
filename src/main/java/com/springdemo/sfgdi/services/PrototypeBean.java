package com.springdemo.sfgdi.services;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean()
    {
        System.out.println("I am a Prototype Beam!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public String getMyScope()
    {
        return "I am a ProtoType";
    }
}
