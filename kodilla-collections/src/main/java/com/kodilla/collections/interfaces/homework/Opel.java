package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int oprlSpeed;

    public Opel(int opelSpeed){
        this.oprlSpeed = opelSpeed;
    }
    @Override
    public int getSpeed() {
        return oprlSpeed;
    }

    @Override
    public int increaseSpeed() {
        int inceraseSpeed = 5;
        for( int i= 0 ; i < oprlSpeed; i++){
            inceraseSpeed++;


        }
        return inceraseSpeed;
    }

    @Override
    public int decreaseSpeed() {
        int decreaseSpeed = oprlSpeed;
        for (int i = 0; i < decreaseSpeed; i++) {

            decreaseSpeed--;
        }
        return decreaseSpeed;
    }
}
