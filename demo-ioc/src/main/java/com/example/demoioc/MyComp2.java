package com.example.demoioc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component()
public class MyComp2 implements MyComp{
    public String hello(){
        System.out.println("hello from MyComp2");
        return "comp2";
    }
}
