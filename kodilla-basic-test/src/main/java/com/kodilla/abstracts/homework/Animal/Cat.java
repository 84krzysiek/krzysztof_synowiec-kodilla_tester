package com.kodilla.abstracts.homework.Animal;

public class Cat extends Animal{


    public Cat() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Miau Miau");

    }
}
