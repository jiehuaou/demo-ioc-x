package com.example.demo.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * X depend on W Y Z
 * 
 * demo-1, Autowired by method
 *   
 *   @Autowired
 *   public void config(ComponentY y){
 *       this.y = y;
 *   }
 * 
 * 
 * 
 */
@Component
public class ComponentX implements Printer{

    static int counter = 10;
    private int index = ++counter;

    @Autowired
    private ComponentW w;

    private ComponentY y;

    @Autowired
    private ComponentZ z;

    public ComponentX() {
        System.out.println("ComponentX ... constructed");
    }

    @Autowired
    public void config(ComponentY y){
        System.out.println("ComponentY config into X");
        this.y = y;
    }

    @PostConstruct
    public void init(){
        z.config(this);
    }

    @Override
    public String toString() {
        return "ComponentX{ y }";
    }

    @Override
    public void show() {
        System.out.println("this is from X " + id() + y.id() + z.id() + w.id());
        //y.show();
    }

    @Override
    public String id() {
        return "-x" + index;
    }
}
