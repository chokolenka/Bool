package com.company.bool;

public class AnimalSchool {
    public static void main(String[] args) {
        Hare hare = new Hare();

        hare.run
                ();

        Duck duck = new Duck();
        duck.swim();


    }
}
interface Runnable{
    void run();
}
interface Swimable{
    void swim();

}
interface Climbable{
    void climb();

}
abstract class Animal{

}

class Hare extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("Hare: I can run");

    }
}

class Duck extends Animal implements Runnable, Swimable{

    @Override
    public void run() {
        System.out.println("Duck: I can run");

    }

    @Override
    public void swim() {
        System.out.println("Duck: I can swim");

    }
}