package com.nhmk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Person {
    private String name = "Lucy";
    //    @Autowired
    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(Level.INFO, "Person bean created by Spring");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
