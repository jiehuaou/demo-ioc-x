package com.example.demoioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComp1 {
    MyComp comp2;

    @Autowired
    public MyComp1(MyComp comp){
        this.comp2 = comp;
    }

    public String hello(){
        System.out.println("hello from MyComp1 then...");
        return "comp1 by " + comp2.hello();
    }
}
