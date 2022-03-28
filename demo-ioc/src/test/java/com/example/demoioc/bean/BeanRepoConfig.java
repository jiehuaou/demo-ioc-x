package com.example.demoioc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRepoConfig {
    @Bean(name = "adapter1")
    public BeanRepo adapter1a(){
        System.out.println("create ......... adapter1");
        return new BeanRepoAdapter1();
    }

    @Bean(name = "adapter2")
    public BeanRepo adapter2a(){
        System.out.println("create ......... adapter2");
        return new BeanRepoAdapter2();
    }

    @Bean
    /**
     * BeanRepo adapter1, will use bean with name: adapter1
     * BeanRepo adapter2, will use bean with name: adapter2
     */
    public BeanRepoComponent comp1x(BeanRepo adapter1, BeanRepo adapter2) {
        return new BeanRepoComponent(adapter1, adapter2);
    }
}
