package Inheritance.Hybrid;

class GrandParent5{
	void A(){
	System.out.println("Calling A");
	}
}

class Parent5 extends GrandParent5 {
	void B(){
		System.out.println("Calling B");
	}
}

class Child51 extends Parent5 {
	void C(){
		System.out.println("Calling C");
	}
}

class Child52 extends Parent5 {
	void D(){
		System.out.println("Calling D");
	}
}

public class Hybrid5{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
        System.out.println("Obect from Parent");
        Parent5 obj = new Parent5();
		obj.A();
		obj.B();

        System.out.println("Obect from Child1");
		Child51 obj1 = new Child51();
		obj1.A();
		obj1.B();
        obj1.C();

        System.out.println("Obect from Child2");
		Child52 obj2 = new Child52();
		obj2.A();
		obj2.B();
        obj2.D();
	}
}
