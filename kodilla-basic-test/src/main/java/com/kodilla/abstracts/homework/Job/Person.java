package com.kodilla.abstracts.homework.Job;

public class Person {
    public String firstName;
    public Job job;
    public int age;

    public void showResposibilitie() {
        System.out.println(job.getSalary() + job.getResponsibilities());

    }


    public Person(String firstName, Job job, int age) {
        this.firstName = firstName;
        this.job = job;
        this.age = age;

    }

    public static void main(String[] args) {


        Driver driver = new Driver(2000, "  Driving a car");
        Person person = new Person("Mike", driver, 33);
        person.showResposibilitie();


        Sportsman sportsman = new Sportsman(2500,"  Training");
        Person person1 = new Person("Anna", sportsman, 35);
        person1.showResposibilitie();

        Musican musican = new Musican(4000, "  Singing");
        Person person2 = new Person("Kate",musican,44);
        person2.showResposibilitie();

        Journalist journalist = new Journalist(5000,"Journalist");
        Person person3 = new Person("Kate",journalist,56);
        person3.showResposibilitie();


    }
}
