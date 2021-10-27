package com.example.demo.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Y depend on X Z W
 */
@Component
public class ComponentY implements Printer{
    static int counter = 20;
    private int index = ++counter;

    private ComponentX x;
    private ComponentZ z;
    @Autowired
    private ComponentW w;

    public ComponentY() {
        System.out.println("ComponentY ... constructed");
    }

    @Autowired
    public void config(ComponentZ z){
        System.out.println("ComponentZ config into Y " + z.getClass().toString());
        this.z = z;
    }

    @Override
    public String toString() {
        return "ComponentY{ x }";
    }

    @Override
    public void show() {
        System.out.println("this is from Y " + id() + x.id() + z.id() + w.id());
    }

    @Override
    public String id() {
        return "-y" + index;
    }

    @Autowired
    public void setX(ComponentX x) {
        System.out.println("ComponentX setter into Y");
        this.x = x;
    }
}
