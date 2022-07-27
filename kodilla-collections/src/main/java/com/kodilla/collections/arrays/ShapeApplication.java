package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for (int n = 0; n<shapes.length; n++)
            shapes [n] = drawShape();
        for (Shape shape:shapes)
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        //double a = random.nextDouble() * 100 + 1;
         //double b = random.nextDouble() * 100 + 1;
         //double c = random.nextDouble() * 100 + 1;

        double a = getRandomSize(random);
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize(random);
            double c = getRandomSize(random);
            return new Triangle(a, b, c);

        }
    }

    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;       // possible values: 1.000-100.999...
    }
}

