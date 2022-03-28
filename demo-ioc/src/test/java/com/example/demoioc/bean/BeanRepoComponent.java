package com.example.demoioc.bean;

import org.springframework.stereotype.Component;


public class BeanRepoComponent {

    final BeanRepo adapter1;
    final BeanRepo adapter2;

    public BeanRepoComponent(BeanRepo adapter1, BeanRepo adapter2) {
        this.adapter1 = adapter1;
        this.adapter2 = adapter2;
    }

    public void hello() {
        System.out.println("component->" + adapter1.hello());
        System.out.println("component->" + adapter2.hello());
    }
}
