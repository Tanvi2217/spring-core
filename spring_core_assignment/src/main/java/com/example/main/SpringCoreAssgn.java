package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreAssgn {
    public static void main(String[] args) {
//        With use of Spring and DI
//        1st step is to initialise IOC(Inversion of control) container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().moveVehicle();

    }
}
