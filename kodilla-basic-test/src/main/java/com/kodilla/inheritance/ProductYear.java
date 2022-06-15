package com.kodilla.inheritance;

public class ProductYear extends OperatingSystem {


    @Override
    public void setYear(int year) {
        super.setYear(year);
    }
    public void turnOn() {
        System.out.println("Operating System turn on");
    }
    public void turnOff(){
        System.out.println("Operating system turn off");
    }

}
