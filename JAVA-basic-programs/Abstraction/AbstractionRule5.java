package Abstraction;
/*
    Rule5: if concrete/non-abstract class extends abstract class then
    it's mandatory for that child class to provide method implementations of
    abstract methods of super/parent class.
*/

abstract class ParentAbstract {
    abstract void display();
}


public class AbstractionRule5 extends ParentAbstract {

    /*
        if concrete class extends abstract class then we get error so concrete class need to
         provide implementations of present abstract methods in parent abstract class
    */

    public void display(){
        System.out.println("Display In AbstractionRule5");
    }

    public static void main(String[] args) {
      /*
        we need at least one concrete class to extends present abstract methods
        so using concrete class we can provide implementation for abstract methods and
        call them by creating object of concrete class
      */

        AbstractionRule5 obj = new AbstractionRule5();
        obj.display();
    }
}
