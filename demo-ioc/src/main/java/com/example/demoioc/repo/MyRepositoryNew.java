package com.example.demoioc.repo;

import com.example.demoioc.MyRepository;
import com.example.demoioc.SubRepository;

public class MyRepositoryNew implements MyRepository {
    final SubRepository subRepository;

    public MyRepositoryNew(SubRepository subRepository) {
        this.subRepository = subRepository;
    }

    @Override
    public String hello() {
        return "New->" + subRepository.world();
    }
}
