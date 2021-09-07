package com.example.demo.circle;

import org.springframework.stereotype.Component;

@Component
public class ComponentW implements Printer{

    static int counter = 40;
    private int index = ++counter;

    public ComponentW() {
        System.out.println("ComponentW ... constructed");
    }

    @Override
    public void show() {
        //...
    }

    @Override
    public String id() {
        return "-w"+index;
    }
}
