package com.example.demoioc.repo;

import com.example.demoioc.MyRepository;
import com.example.demoioc.SubRepository;

public class MyRepositoryOld implements MyRepository {
    final SubRepository subRepository;

    public MyRepositoryOld(SubRepository subRepository) {
        this.subRepository = subRepository;
    }

    @Override
    public String hello() {
        return "Old->" + subRepository.world();
    }
}
