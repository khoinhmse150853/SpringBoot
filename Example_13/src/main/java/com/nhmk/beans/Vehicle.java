package com.nhmk.beans;

import com.nhmk.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Vehicle {
    private final VehicleServices vehicleServices;
    private String name = "Honda";

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void printHello() {
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(Level.SEVERE, "Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }
}
