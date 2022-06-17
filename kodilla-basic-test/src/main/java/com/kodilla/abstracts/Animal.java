package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs;


    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;//konstruktor Animal
    }

    public int getNumberOfLegs() {
        return numberOfLegs;//getter wydobywajacy wartosc prywatnej zmiennej numberOfLegs
    }
    public abstract void giveVoice();//pierwsza metoda abstrakcyjna,każda klasa dziedzicząca po animal bedzie mogła dodac swoją implementacje

}
