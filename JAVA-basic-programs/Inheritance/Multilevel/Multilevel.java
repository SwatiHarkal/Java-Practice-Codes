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

class Child extends Parent {
	void C(){
		System.out.println("Calling C");
	}
}

public class Multilevel{
	public static void main(String args[]){
		System.out.println("Multilevel Inheritance");
        Parent obj = new Parent();
		obj.A();
		obj.B();

		Child obj1 = new Child();
		obj1.A();
		obj1.B();
        obj1.C();
	}
}
