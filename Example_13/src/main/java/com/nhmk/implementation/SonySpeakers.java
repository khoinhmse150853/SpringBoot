package com.nhmk.implementation;

import com.nhmk.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("SonySpeakers")
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Sony speakers";
    }
}
