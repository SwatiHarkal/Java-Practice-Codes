package Constructor;

class ParentConstructorClass {
    public ParentConstructorClass() {
        System.out.println("No-args constructor in parent");//1
    }

    public ParentConstructorClass(int a, String b) {
        this();
        System.out.println("2-args constructor in parent");//2
    }
}

public class CombinationOfThisandSuper extends ParentConstructorClass {
    public CombinationOfThisandSuper() {
        super(10,"Java");
        System.out.println("No-args constructor in child");//3
    }

    public CombinationOfThisandSuper(int a, String b, int c) {
        this();
        System.out.println("2-args constructor in child");//4
    }

    public static void main(String[] args) {
        CombinationOfThisandSuper obj = new CombinationOfThisandSuper(10,"Java",20);
    }
}
