package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

    }

    @Test
    public void testSubstrackt() {
        Calculator calcSubs = new Calculator();
        int a = 15;
        int b = 4;
        int SustracktResult = calcSubs.substract(a, b);
        assertEquals(11, SustracktResult);
    }

    @Test
    public void testSquare() {
        Calculator calcSquare = new Calculator();
        double a = 5;
        double b = 5;
        double d = 2;
        double SquareResult = calcSquare.doubleSquare (a,b, d);
        assertEquals(11, SquareResult, 1);
    }


}

