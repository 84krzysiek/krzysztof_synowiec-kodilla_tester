package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public String job;
    public int age;

    public Person(String firstName, String job, int age) {
        this.firstName = firstName;
        this.job = job;
        this.age = age;
    }

    public static void main(String[] args) {


        Driver driver = new Driver();
        driver.getSalary();
        driver.getResponsibilities();

        Sportsman sportsman = new Sportsman();
        sportsman.getSalary();
        sportsman.getResponsibilities();


    }
}
