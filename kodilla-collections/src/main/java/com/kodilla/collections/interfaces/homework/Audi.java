package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int audiSpeed;

    public Audi(int audiSpeed) {
        this.audiSpeed = audiSpeed;
    }

    @Override
    public int getSpeed() {
        return audiSpeed;
    }

    @Override
    public int increaseSpeed() {
        int inceraseSpeed = 5;
        for (int i = 0; i < audiSpeed; i++) {
            inceraseSpeed++;


        }
        return inceraseSpeed;
    }

    @Override
    public int decreaseSpeed() {
        int decreaseSpeed = audiSpeed;
        for (int i = 0; i < decreaseSpeed; i++) {

            decreaseSpeed--;
        }
        return decreaseSpeed;
    }
}
