package com.nhmk.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void initialize() {
        setName("Suzuki");
    }

    @PreDestroy
    public void destroy() {
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(java.util.logging.Level.SEVERE, "Destroying Vehicle Bean");
    }

    public void printHello() {
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(java.util.logging.Level.SEVERE, "Printing Hello from Component Vehicle Bean");
    }
}
