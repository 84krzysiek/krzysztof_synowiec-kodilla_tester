package com.kodilla.abstracts.homework;

public class Square extends Shape{

    int a;



    public Square(int a) {
        this.a = a;
    }

    @Override
    public double Area() {
        return a*a;
    }
}
