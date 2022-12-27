package com.nhmk.services;

import com.nhmk.beans.Vehicle;
import com.nhmk.interfaces.Speakers;
import com.nhmk.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleServices {
    @Autowired
    @Qualifier("BoseSpeakers")
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic() {
        String music = speakers.makeSound();
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(Level.SEVERE, music);
    }

    public void moveVehicle() {
        String status = tyres.rotate();
        Logger logger = Logger.getLogger(Vehicle.class.getName());
        logger.log(Level.SEVERE, status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
