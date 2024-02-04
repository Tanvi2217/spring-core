package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    @Autowired(required = false) //to avoid NoSuchBeanDefinitionException when bean has not created yet.
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicle() {
        return vehicle.getName();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
