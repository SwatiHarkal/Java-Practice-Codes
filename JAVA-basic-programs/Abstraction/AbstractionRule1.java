package Abstraction;
//Rule1: It's not mandatory to have abstract method in abstract class,
// it can we abstract or non-abstract/concrete

//Rule3: We can not create an object of abstract class

abstract class AbstractClass {
    abstract void abstractMethod();

    void concreteMethod() {
        System.out.println("concreteMethod");
    }
}

public class AbstractionRule1 {

}
