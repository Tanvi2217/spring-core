package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class RegisterBeanMethod {
    public static void main(String[] args) {
//        Below program denotes normal POJO method with using new.
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("With use of new - " + vehicle.getName());

//        With use of Spring and DI
//        1st step is to initialise IOC(Inversion of control) container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //creating two supplier functions
        Vehicle volksWagon = new Vehicle();
        volksWagon.setName("VolksWagon");
        Supplier<Vehicle> volkswagonSupplier = ()-> volksWagon;

        Supplier<Vehicle> vehicleSupplier = ()-> {
            Vehicle vehicle1 = new Vehicle();
            vehicle1.setName("Hyundai");
            return vehicle1;
        };
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if(randomNumber % 2 == 0) {
            context.registerBean("hyundai", Vehicle.class, vehicleSupplier);
        } else {
            context.registerBean("volkswagon", Vehicle.class, volkswagonSupplier);
        }

        Vehicle hyundaiVehicle = null;
        Vehicle volkswagonVehicle = null;

        try {
            hyundaiVehicle = context.getBean("hyundai",Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println(e.getMessage());
        }

        try {
            volkswagonVehicle = context.getBean("volkswagon", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println(e.getMessage());
        }

        if(hyundaiVehicle != null) {
            System.out.println("Car name is: "+ hyundaiVehicle.getName());
        }
        if(volkswagonVehicle != null){
            System.out.println("Car name is: "+ volkswagonVehicle.getName());
        }


    }
}
