package com.kodilla.inheritance;

public class OperatingSystem {
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Operating System turn on");
    }
    public void turnOff(){
        System.out.println("Operating system turn off");
    }
    public void displaySystemYear(){
        System.out.println("System activated : " + year);
    }
}

