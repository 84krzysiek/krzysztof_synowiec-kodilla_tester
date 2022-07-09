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
    public void testSqr() {
        Calculator calcSquare = new Calculator();
        int a = 4;
        double SquareResult = calcSquare.square(a);
        assertEquals(16, SquareResult, 0.001);
    }


}

