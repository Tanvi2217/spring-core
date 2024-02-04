package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "Hyundai")
    public Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Hyundai");
        return veh;
    }

    @Bean(value = "Audi")
    public Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Primary
    @Bean("Ferrari")
    public Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
