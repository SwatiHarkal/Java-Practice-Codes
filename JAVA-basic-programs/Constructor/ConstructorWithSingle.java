package Constructor;

class ParentConstructor {
    public ParentConstructor(){
        System.out.println("No-args parent constructor in single inheritance");

    }
}

public class ConstructorWithSingle extends ParentConstructor {
   public ConstructorWithSingle(){
       System.out.println("No-args child constructor in single inheritance");
    }

    public static void main(String[] args) {
        ConstructorWithSingle obj = new ConstructorWithSingle();
    }
}
