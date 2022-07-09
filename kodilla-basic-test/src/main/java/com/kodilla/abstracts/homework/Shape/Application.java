package com.kodilla.abstracts.homework.Shape;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(5,7);
        System.out.println(square.Area());
        System.out.println(rectangle.Area());


    }
}
