package com.kodilla.abstracts.homework;

public class Driver extends Job {



    @Override
    public void getSalary() {
        System.out.println("Driver salary is :" + 2500);

    }

    @Override
    public void getResponsibilities() {
        System.out.println("Driver is delivery the goods");

    }
}
