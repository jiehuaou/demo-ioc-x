package com.example.demoioc.bean;

public class BeanRepoAdapter1 implements BeanRepo{
    @Override
    public String hello() {
        return "BeanRepo Adapter1";
    }
}
