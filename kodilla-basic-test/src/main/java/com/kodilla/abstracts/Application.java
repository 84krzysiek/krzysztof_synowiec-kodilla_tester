package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog();//typ referencji-odwołanie do danych obiektu
        //Dog dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
