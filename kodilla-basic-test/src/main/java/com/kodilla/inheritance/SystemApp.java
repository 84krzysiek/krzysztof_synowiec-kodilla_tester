package com.kodilla.inheritance;

public class SystemApp {
    public static void main(String[] args) {
        OperatingSystem turnOn = new OperatingSystem();
        turnOn.turnOn();
        OperatingSystem turnOff = new OperatingSystem();
        turnOff.turnOff();

        ProductYear setYear = new ProductYear();
        setYear.setYear(1995);
        setYear.displaySystemYear();


    }
}
