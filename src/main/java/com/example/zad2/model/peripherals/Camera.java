package com.example.zad2.model.peripherals;

import com.example.zad2.model.abstractions.Peripheral;

public class Camera extends Peripheral {
    public Camera() {
        pName = "Camera";
        pDescription = "Used for taking photos or live recordings.";
    }

    @Override
    public Object execute(Object... o) {
        return null;
    }
}
