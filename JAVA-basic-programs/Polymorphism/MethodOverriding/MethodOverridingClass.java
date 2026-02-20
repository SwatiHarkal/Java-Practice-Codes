package Polymorphism.MethodOverriding;
//we can't use private modifiers in overriding
//if used then it's not overriding
class A {
    private void m1()
    {
        System.out.println("m1-A");
    }
}
public class MethodOverridingClass extends A {
    private void m1()
    {
        System.out.println("m1-B");
    }
    public static void main(String[] args)
    {
        MethodOverridingClass b = new MethodOverridingClass();
        b.m1();
    }
}
