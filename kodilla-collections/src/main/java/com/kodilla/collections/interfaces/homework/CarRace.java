package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100);
        doRace(ford);

        Audi audi = new Audi(150);
        doRace(audi);


        Opel opel = new Opel(100);
        doRace(opel);
    }

    private static void doRace(Car car){
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
    }
}
