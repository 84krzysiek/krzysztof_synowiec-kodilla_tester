package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int fordSpeed;

    public Ford(int fordSpeed){
        this.fordSpeed = fordSpeed;
    }

    @Override
    public int getSpeed() {

        return fordSpeed;
    }

    @Override
    public int increaseSpeed() {
        int inceraseSpeed = 5;
        for( int i= 0 ; i < fordSpeed; i++){
            inceraseSpeed++;


        }
        return inceraseSpeed;
    }

    @Override
    public int decreaseSpeed() {
        int decreaseSpeed = fordSpeed;
        for (int i = 0; i < decreaseSpeed; i++) {

            decreaseSpeed--;
        }
        return decreaseSpeed;
    }
}



