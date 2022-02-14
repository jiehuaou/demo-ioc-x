package com.example.demoioc.repo;

import com.example.demoioc.MyRepository;

public class MyRepositoryNew implements MyRepository {
    @Override
    public String hello() {
        return "New";
    }
}
