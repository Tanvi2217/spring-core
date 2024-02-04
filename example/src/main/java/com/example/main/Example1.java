package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
//        Below program denotes normal POJO method with using new.
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("With use of new - " + vehicle.getName());

//        With use of Spring and DI
//        1st step is to initialise IOC(Inversion of control) container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("With use of spring IOC and DI - "+ veh.getName());

        String string = context.getBean(String.class);
        System.out.println("With use of spring IOC and DI - "+ string);

        Integer number = context.getBean(Integer.class);
        System.out.println("With use of spring IOC and DI - "+ number);
    }
}
