package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    public Opel(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increaseOpelSpeed;
        increaseOpelSpeed = speed +70;
        increaseOpelSpeed++;

    }

    @Override
    public void decreaseSpeed() {
        int decreaseOpelSpeed = 0;
        decreaseOpelSpeed = speed -20;
        decreaseOpelSpeed--;


    }
}