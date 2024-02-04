package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryAnnotation {
    public static void main(String[] args) {
//        Below program denotes normal POJO method with using new.
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("With use of new - " + vehicle.getName());

//        With use of Spring and DI
//        1st step is to initialise IOC(Inversion of control) container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("Hyundai",Vehicle.class);
        System.out.println("With use of spring IOC and DI - "+ veh1.getName());
    }
}
