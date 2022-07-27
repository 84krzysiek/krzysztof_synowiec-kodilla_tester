package com.kodilla.collections.homework;

import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {


    public static void describeCar(Car car) {
        System.out.println("------------------------");
        System.out.println(getCarName(car));
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());


    }


    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "unknown";
    }


}



