package AccessModifires.P2;

import AccessModifires.P1.ProtectedClass;
//diffrent package subclasses
public class ProtectedIndifferentPkg extends ProtectedClass {
    public static void main(String[] args) {
        ProtectedIndifferentPkg obj = new ProtectedIndifferentPkg();
        System.out.println(obj.a);
        obj.show();
    }
}