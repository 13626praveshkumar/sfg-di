package com.springdemo.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"EN","default"})   //default will be the profile if we don't specify any proofile in properties
public class I18nEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world EN";
    }
}
