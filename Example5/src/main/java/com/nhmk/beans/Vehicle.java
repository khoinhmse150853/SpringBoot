package com.nhmk.beans;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Vehicle {
    private String name;

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
}
