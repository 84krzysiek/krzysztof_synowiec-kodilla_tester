package com.kodilla.abstracts.homework.Shape;

public class Rectangle extends Shape {
    int a;
    int b;


    public Rectangle (int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double Area() {
        return b*b;
    }
}
