package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public Job Job;
    public int age;




    public Person(String firstName, Job Job , int age) {
        this.firstName = firstName;
        this.Job = Job;
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
