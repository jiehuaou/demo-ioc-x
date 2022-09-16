package com.example.demoioc.adapter;

import com.example.demoioc.MyComp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Setter-Based Dependency Injection
 */

@Component("comp3")
public class MyComp3 {

    public MyComp getComp2() {
        return comp2;
    }

    @Autowired
    public void setComp2(MyComp comp2) {
        this.comp2 = comp2;
    }

    MyComp comp2;

    public String hello(){
        System.out.println("hello from MyComp3 then...");
        return "comp3 by " + comp2.hello();
    }
}
