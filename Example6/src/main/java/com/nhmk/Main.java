package com.nhmk;

import com.nhmk.beans.Vehicle;
import com.nhmk.configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ProjectConfig.class.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        logger.log(java.util.logging.Level.SEVERE, "Vehicle name from Spring Context is: {0}", veh.getName());
        veh.printHello();
        context.close();
    }
}