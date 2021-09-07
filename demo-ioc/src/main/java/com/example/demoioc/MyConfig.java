package com.example.demoioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ConfigurationProperties(prefix = "choose")
public class MyConfig {

    @Value("${choose.profile}")
    public String profile;

    @Bean()
    @Primary
    public MyComp getBean(){
        return new MyComp2();
    }
}
