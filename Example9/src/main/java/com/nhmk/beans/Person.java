package com.nhmk.beans;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Person {
    private String name;
    private Vehicle vehicle;

    public Person() {
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(Level.INFO, "Person bean created by Spring");
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
