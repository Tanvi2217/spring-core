package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Hyundai");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Tanvi");
        person.setVehicle(vehicle);
        return person;
    }
}
