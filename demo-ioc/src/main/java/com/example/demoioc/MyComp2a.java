package com.example.demoioc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component()
public class MyComp2a implements MyComp{
    @Override
    public String hello() {
        System.out.println("hello from MyComp2 dev");
        return "comp2a";
    }
}
