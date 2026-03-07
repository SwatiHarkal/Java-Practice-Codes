package Polymorphism.Casting;

class CastingParent{
    void A(){
        System.out.println("method from Parent class");
    }
}


public class CastingClass extends CastingParent {
    void A(){
        System.out.println("method from Child Class");
    }

    public static void main(String[] args) {
        CastingClass obj = new CastingClass(); //no casting
        obj.A();  //Child Class

        CastingParent parent = new CastingParent(); // no casting
        parent.A(); // Parent class

        CastingParent a = new CastingClass(); //upcasting
        a.A(); //Child class

        CastingClass c = (CastingClass) a;  //downcasting but added object of reference a
        // CastingClass c = (CastingClass) new CastingParent
        c.A();

        CastingClass b = (CastingClass) new CastingParent(); //dowcasting
        b.A(); //error classcastexception

    }
}
