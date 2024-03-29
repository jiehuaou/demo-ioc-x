package com.example.demoioc.adapter;

import com.example.demoioc.MyComp;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Component with profile dev
 */

@Profile("dev")
@Component("comp2")
public class MyComp2a implements MyComp {
    @Override
    public String hello() {
        System.out.println("hello from MyComp2 dev");
        return "comp2a";
    }
}
