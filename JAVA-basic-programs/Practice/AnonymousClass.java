package Practice;

class Fruits {
    void mango(){
        System.out.println("Sweet");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Fruits obj =  new Fruits(){
            public void mango(){
                System.out.println("Sour");
            }
        };
        obj.mango();
        //separate obj to call parent class method
        Fruits obj1 = new Fruits();
        obj1.mango();
    }
}
