package com.kodilla.abstracts.homework.Animal;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal duck = new Duck();
        Animal cat = new Cat();


        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        AnimalProcessor processor1 = new AnimalProcessor();
        processor1.process(duck);

        AnimalProcessor processor2 = new AnimalProcessor();
        processor2.process(cat);
    }
}
