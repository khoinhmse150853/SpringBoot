package com.nhmk.configs;

import com.nhmk.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value = "hondaVehicle")
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("ferrariVehicle")
    @Primary
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }
}
