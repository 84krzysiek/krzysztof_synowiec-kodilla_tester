package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 12;
        int b = 7;
        int sumResult = calculator.sum(a, b);
        int ResultSubstract = calculator.substract(a, b);
        int square = calculator.square(a);

        boolean correct = ResultChecker.AssertEquals(19, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie " +  a  + " i " +  b );
        } else {
            System.out.print("Metpda sum nie dziąła poprawnie  " + a + " i " +  b);
        }
        boolean noCorrect = ResultChecker.AssertEquals(5, ResultSubstract);
        if (noCorrect) {
            System.out.println("Metoda substract działa poprawnie" + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie " +   a   + "  i  " +  b);
        }
        boolean square1 = ResultChecker.AssertEquals(144, square);
        if (square1) {
            System.out.print("Metoda podnoszenia do kwadratu działa poprawnie "  +  a  +  "  ");
        } else {
            System.out.println("Metoda podnoszenia do kwadratu nie działa poprawnie");
        }
    }
}