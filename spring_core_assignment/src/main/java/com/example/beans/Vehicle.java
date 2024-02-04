package com.example.beans;

import com.example.services.VehicleService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public String name;

    public String getName() {
        return name;
    }

    public final VehicleService vehicleService;

    public VehicleService getVehicleService() {
        return vehicleService;
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

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

}