package Constructor;

class Addition {
    public Addition(){
        System.out.println("No-args constructor for Addition");
    }

    public Addition(int a, int b) {
        int c = a + b;
        System.out.println("Addition: " +c);
    }
}

class Subtraction extends Addition {
    public Subtraction(){
        System.out.println("No-args constructor for Subtraction");
    }

    public Subtraction(int a, int b) {
        super(a,b);
        int c = a - b;
        System.out.println("Substraction: " +c);
    }
}

class Multiplication extends Addition {
    public Multiplication(int a, int b) {
        super(a,b);
        int c = a * b;
        System.out.println("Multiplicattion: " +c);
    }
}

public class ConstructorOperations extends Subtraction {
    public ConstructorOperations() {
        System.out.println("No-args constructor for ConstructorOperations");
    }


    public ConstructorOperations(int a, int b) {
        super(a,b);
        int c = a % b;
        System.out.println("Modulus: " +c);
    }

    public static void main(String[] args) {
        ConstructorOperations obj= new ConstructorOperations();
        ConstructorOperations obj1 = new ConstructorOperations(40,20);
        System.out.println("For Multiplication Constructor");
        Multiplication obj2 = new Multiplication(10, 20);
    }

}
