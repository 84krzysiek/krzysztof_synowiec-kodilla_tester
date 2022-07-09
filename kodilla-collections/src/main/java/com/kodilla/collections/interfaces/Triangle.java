package com.kodilla.collections.interfaces;

public class Triangle implements Shape {

    private double width;
    private double height;
    private double hypnotenuse;

    public Triangle(double width, double height, double hypnotenuse) {
        this.width = width;
        this.height = height;
        this.hypnotenuse = hypnotenuse;
    }

    public double getPerimeter() {
        return width + height + hypnotenuse;
    }


    @Override
    public double getArea() {
        return width * height / 2;
    }

}
