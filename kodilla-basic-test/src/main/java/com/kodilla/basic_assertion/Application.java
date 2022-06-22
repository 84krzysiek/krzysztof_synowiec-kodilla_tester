package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 12;
        int b = 7;
        int sumResult = calculator.sum(a, b);
        int sumResultSubstract = calculator.substract(a,b);
        boolean correct = ResultChecker.AssertEquals(19, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie" + a + "i" + b);
        } else {
            System.out.print("Metpda sum nie dziąła poprawnie " + a + "i" + b);
        }
        boolean substractRes = ResultChecker.AssertEquals(5,sumResultSubstract);
        if (correct){
            System.out.println("Metoda substract działa poprawnie"+ a +"i" + b);
        } else
            System.out.println("Metoda substract nie działa poprawnie" + a + "i" + b);


    }
}
