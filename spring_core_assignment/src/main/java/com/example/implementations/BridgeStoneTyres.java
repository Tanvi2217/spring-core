package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle is rotated by Bridge Stone Tyres";
    }
}
