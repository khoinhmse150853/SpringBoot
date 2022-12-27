package com.nhmk.configs;

import com.nhmk.beans.Person;
import com.nhmk.beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.nhmk.implementation",
        "com.nhmk.services"})
@ComponentScan(basePackageClasses = {Vehicle.class,
        Person.class})
public class ProjectConfig {

}
