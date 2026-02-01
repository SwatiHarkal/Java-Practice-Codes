package Abstraction;

/*
    2. Write a Java program to create an abstract class Person
       with abstract methods eat() and exercise(). Create subclasses
       Athlete and LazyPerson that extend the Person class and
       implement the respective methods to describe how each person eats and exercises.
 */

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    public void eat() {
        System.out.println("Athlete Eats Protein related foods");
    }
    public void exercise() {
        System.out.println("Athlete exercising daily");
    }
}

class LazyPerson extends Person {
    public void eat() {
        System.out.println("LazyPersoon Eats junk foods");
    }
    public void exercise() {
        System.out.println("LazyPerson rarely exercising or being physically active");
    }
}

public class AbstractionPractice1 {
    public static void main(String[] args) {
        Athlete obj = new Athlete();
        obj.eat();
        obj.exercise();

        System.out.println("===================");

        LazyPerson obj2 = new LazyPerson();
        obj2.eat();
        obj2.exercise();
    }
}
