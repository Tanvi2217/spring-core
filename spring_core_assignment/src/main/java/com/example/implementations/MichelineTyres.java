package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelineTyres implements Tyres {
    @Override
    public String rotate() {
        return null;
    }
}
