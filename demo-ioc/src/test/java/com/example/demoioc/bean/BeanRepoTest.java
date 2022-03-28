package com.example.demoioc.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BeanRepoTest {
    @Autowired
    BeanRepo adapter1;
    @Autowired
    BeanRepo adapter2;
    @Autowired
    BeanRepoComponent comp1;

    @Test
    public void testBeanRepo(){
        System.out.println(adapter1.hello());
        System.out.println(adapter2.hello());

        comp1.hello();
    }

}
