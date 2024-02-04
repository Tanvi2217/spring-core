package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringAnnotationConstructor {
    public static void main(String[] args) {
//        Below program denotes normal POJO method with using new.
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Honda City");
        System.out.println("With use of new - " + vehicle1.getName());

//        With use of Spring and DI
//        1st step is to initialise IOC(Inversion of control) container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("Vehicle name is: "+vehicle.getName() );
        System.out.println("Person name is: "+ person.getName());
        System.out.println("Person's vehicle name is: "+ person.getVehicle());
    }
}
