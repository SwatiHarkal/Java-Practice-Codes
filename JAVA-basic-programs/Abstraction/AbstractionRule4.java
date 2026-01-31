package Abstraction;

//Rule4: if one abstract class extends another abstract class then
//it's not mandatory for that child class to provide method implementations of
//abstract methods of super/parent class.

abstract class AbstractParent {
    abstract void AbstractMethodParent ();
}

abstract class AbstractChild extends AbstractParent {
    abstract void AbstractMethodChild(); //not asking to implement
                                         // abstract method of parent abstract class
}

public class AbstractionRule4 {
}
