package Polymorphism.MethodOverriding;

class Overridingmain{
    void main(int a){
        System.out.println("Overridingmain");
    }
}


public class MainOverrideing extends Overridingmain {

    void main(int a) {
        System.out.println("inside main Overridingmain");
    }
    public static void main(String[] args) {
        Overridingmain obj = new Overridingmain();
        obj.main(10);
    }
}
