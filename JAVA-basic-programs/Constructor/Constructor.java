package Constructor;

class ConstructorExample {
    public ConstructorExample(int a) {
        System.out.println("parent with parameters,a: " +a);
    }
}

public class Constructor extends ConstructorExample {
    public Constructor(int i) {
        super(20);
        System.out.println("Child with parameters, i: " +i);

    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(10);
    }
}
