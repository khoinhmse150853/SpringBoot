package com.nhmk;

import com.nhmk.beans.Vehicle;
import com.nhmk.configs.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(ProjectConfig.class.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        logger.log(Level.INFO, "Random number: {0}", randomNumber);
        if ((randomNumber % 2) == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            logger.log(Level.INFO, "Error while creating Volkswagen vehicle");
        }
        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            logger.log(Level.INFO, "Error while creating Audi vehicle");
        }

        if (null != volksVehicle) {
            logger.log(Level.INFO, "Programming Vehicle name from Spring Context is: {0}", volksVehicle.getName());
        } else if (null != audiVehicle) {
            logger.log(Level.INFO, "Programming Vehicle name from Spring Context is: {0}", audiVehicle.getName());
        }

    }
}