package com.example.demoioc.adapter;

import org.springframework.stereotype.Component;

import com.example.demoioc.MyComp;

/**
 * Constructor-Based Dependency Injection
 */

@Component("comp1")
public class MyComp1 {
    MyComp comp2;

    // this autowired is optional
    // @Autowired
    public MyComp1(MyComp comp){
        System.out.println("inject MyComp --> " + comp); // prove this autowired is optional
        this.comp2 = comp;
    }

    public String hello(){
        System.out.println("hello from MyComp1 then...");
        return "comp1 by " + comp2.hello();
    }
}
