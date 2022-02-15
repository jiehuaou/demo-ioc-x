package com.example.demoioc.repo;

import com.example.demoioc.SubRepository;
import org.springframework.stereotype.Component;

@Component
public class MyWorld implements SubRepository {
    @Override
    public String world() {
        return "world";
    }
}
