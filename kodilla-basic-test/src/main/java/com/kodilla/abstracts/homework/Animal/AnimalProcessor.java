package com.kodilla.abstracts.homework.Animal;

public class AnimalProcessor {
    public void process(Animal animal) {
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }
}
