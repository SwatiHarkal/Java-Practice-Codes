package Interface;

/*
    Write a Java program to create an interface Flyable
    with a method called fly_obj(). Create three classes Spacecraft,
    Airplane, and Helicopter that implement the Flyable interface.
    Implement the fly_obj() method for each of the three classes.
 */

interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flyable");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flyable");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is flyable");
    }
}

public class InterfacePractice1 {
    public static void main(String[] args) {
        Spacecraft s = new Spacecraft();
        s.fly_obj();
        Airplane airplane = new Airplane();
        airplane.fly_obj();
        Helicopter helicopter = new Helicopter();
        helicopter.fly_obj();
    }
}
