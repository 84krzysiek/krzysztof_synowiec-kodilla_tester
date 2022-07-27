package com.kodilla.collections.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);


        int a = getRandomCar(random);
        if (drawnCarKind == 0)
            return new Audi(a);
        else if (drawnCarKind == 1)
            return new Ford(a);
        else {
            return new Opel(a);
        }


    }

    private static int getRandomCar(Random random) {
        return RANDOM.nextInt(20);
    }
}




