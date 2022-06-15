package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats) {
        this.seats = seats;
        this.wheels = wheels;
        ;
    }
    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }

    public void openDoors() {
        System.out.print("Opening 4 doors");
    }
    public int getWheels() {
        return wheels;
    }
    public int getSeats() {
        return seats;
    }
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }

}



