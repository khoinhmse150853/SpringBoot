package com.nhmk.beans;

import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Vehicle {
    private String name;

    public Vehicle() {
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(Level.INFO, "Vehicle bean created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(java.util.logging.Level.SEVERE, "Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
