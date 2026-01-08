class GrandParent{
	void A(){
	System.out.println("Calling A");
	}
}

class Parent extends GrandParent {
	void B(){
		System.out.println("Calling B");
	}
}

class Child1 extends Parent {
	void C(){
		System.out.println("Calling C");
	}
}

class Child2 extends Parent {
	void D(){
		System.out.println("Calling D");
	}
}

public class Hybrid5{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
        System.out.println("Obect from Parent");
        Parent obj = new Parent();
		obj.A();
		obj.B();

        System.out.println("Obect from Child1");
		Child1 obj1 = new Child1();
		obj1.A();
		obj1.B();
        obj1.C();

        System.out.println("Obect from Child2");
		Child2 obj2 = new Child2();
		obj2.A();
		obj2.B();
        obj2.D();
	}
}
