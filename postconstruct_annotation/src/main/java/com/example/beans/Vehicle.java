package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void instantiate() {
        this.setName("Hyundai");
    }

    public String printHello() {
        return "Hello to Spring Users";
    }
}