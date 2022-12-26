package com.nhmk;

import com.nhmk.beans.Person;
import com.nhmk.configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(ProjectConfig.class.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        logger.log(Level.INFO, "Person name from Spring Context is: {0}", person.getName());
        logger.log(Level.INFO, "Vehicle that Person own is: {0}", person.getVehicle());
    }
}