package com.kodilla.inheritance;

public class SystemApp {
    public static void main(String[] args) {
        ProductYear setYear = new ProductYear();
        setYear.setYear(1995);
        setYear.displaySystemYear();

        ActivSys activSys = new ActivSys();
        activSys.turnOn();


    }
}
