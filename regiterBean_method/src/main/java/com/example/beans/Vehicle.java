package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Vehicle {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void instantiate() {
//        this.setName("Hyundai");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("The Vehicle Bean has been Destroyed");
//    }

    public String printHello() {
        return "Hello to Spring Users";
    }
}