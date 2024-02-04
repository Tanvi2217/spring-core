package com.example.services;

import com.example.implementations.BoseSpeakers;
import com.example.implementations.BridgeStoneTyres;
import com.example.implementations.MichelineTyres;
import com.example.implementations.SonySpeakers;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle() {
        String move = tyres.rotate();
        System.out.println(move);
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
