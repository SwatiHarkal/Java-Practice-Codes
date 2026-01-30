package AccessModifires.P1;
//protected same package non-subclass

public class ProtectedInSubclass {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        obj.show();
        System.out.println(obj.a);
    }
}
