package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int inceraseSpd;
        inceraseSpd = speed +50;
        inceraseSpd++;

    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpd = 0;
        decreaseSpd = speed - 30;
        decreaseSpd --;

    }
}



