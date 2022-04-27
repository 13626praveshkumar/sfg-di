package com.springdemo.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String getHello() {
        System.out.println("Hello world");
        return "hello";

    }
}