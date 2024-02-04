package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Hyundai");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

}
