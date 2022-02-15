package com.example.demoioc;

import com.example.demoioc.adapter.MyComp2;
import com.example.demoioc.repo.MyRepositoryNew;
import com.example.demoioc.repo.MyRepositoryOld;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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

    @Bean(name = "my-repository")
    @ConditionalOnProperty(name = "new.config.use", havingValue = "true")
    public MyRepository getRepository1(SubRepository subRepository){
        return new MyRepositoryNew(subRepository);
    }

    @Bean(name = "my-repository")
    @ConditionalOnProperty(name = "new.config.use", havingValue = "false")
    public MyRepository getRepository2(SubRepository subRepository){
        return new MyRepositoryOld(subRepository);
    }
}
