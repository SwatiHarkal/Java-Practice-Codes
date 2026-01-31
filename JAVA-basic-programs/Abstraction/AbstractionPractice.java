package Abstraction;

/*
    1. Write a Java program to create an abstract class Animal
       with an abstract method called sound(). Create subclasses Lion and Tiger
       that extend the Animal class and implement the sound() method
       to make a specific sound for each animal.
 */

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal{
    public void sound() {
        System.out.println("Tiger growls");
    }
}

public class AbstractionPractice {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.sound();

        Tiger obj2 = new Tiger();
        obj2.sound();
    }
}
