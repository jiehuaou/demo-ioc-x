package com.example.demoioc.repo;

import com.example.demoioc.MyRepository;

public class MyRepositoryOld implements MyRepository {
    @Override
    public String hello() {
        return "Old";
    }
}
