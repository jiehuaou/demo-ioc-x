package com.example.demo.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Z depend on X W Y
 */

@Component
public class ComponentZ implements Printer{
    static int counter = 30;
    private int index = ++counter;

    ComponentX x;
    @Autowired
    private ComponentW w;

    ComponentY y;

    //@Autowired
    public ComponentZ(@Lazy ComponentY y) {
        System.out.println("ComponentZ ... constructed");
        System.out.println("@Lazy ComponentY into Z " + y.getClass().toString());
        this.y = y;
    }


    public void config(ComponentX x){
        System.out.println("ComponentX config into Z at @PostConstruct");
        this.x = x;
    }

//    @Autowired
//    public void config(ComponentY y){
//        System.out.println("ComponentY config into Z ");
//        this.y = y;
//    }


    @Override
    public void show() {
        System.out.println("this is from Z " + id() + x.id() + y.id() + w.id());
    }

    @Override
    public String id() {
        return "-z" + index;
    }
}
