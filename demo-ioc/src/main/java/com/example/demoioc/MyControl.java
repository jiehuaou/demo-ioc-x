package com.example.demoioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "choose")
public class MyControl {

    @Autowired
    MyConfig config;

    @Autowired
    MyComp1 comp1;

    @Autowired
    MyComp3 comp3;

    @Autowired
    MyComp comp ;

    @RequestMapping("/hello1")
    public String hello1() {
        return comp1.hello();
    }

    @RequestMapping("/hello2")
    public String hello2() {
        System.out.println("current --> " + config.profile);
        return comp.hello();
    }

    @RequestMapping("/hello3")
    public String hello3() {
        return comp3.hello();
    }
}
