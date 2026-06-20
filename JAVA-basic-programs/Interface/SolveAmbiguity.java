package Interface;
interface A {
    void show();

    default void display() {
        System.out.println("display from A");
    }
}

interface B{
    void show();
    default void display() {
        System.out.println("display from B");
    }
}

public class SolveAmbiguity implements A,B {
    @Override
    public void show() {
        System.out.println("Override method from interfaces");
    }

    @Override
    public void display() {
        A.super.display();
        //B.super.display();
        System.out.println("display from Child");
    }

    public static void main(String[] args) {
        SolveAmbiguity obj = new SolveAmbiguity();
        obj.show();
        obj.display();

    }
}
