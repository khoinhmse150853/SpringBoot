package com.nhmk.implementation;

import com.nhmk.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component("BoseSpeakers")
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}
