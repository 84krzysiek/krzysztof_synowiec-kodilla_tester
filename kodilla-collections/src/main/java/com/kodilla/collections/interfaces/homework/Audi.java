package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public  Audi(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increaseAudiSpeed;
        increaseAudiSpeed= speed + 60;
        increaseAudiSpeed ++;
    }

    @Override
    public void decreaseSpeed() {
        int decreaseAudiSpeed = 0;
        decreaseAudiSpeed = speed -40;
        decreaseAudiSpeed--;

    }
}
