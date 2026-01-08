class Parent{
	void A(){
	System.out.println("Calling A");
	}
}

class Child extends Parent {
	void B(){
		System.out.println("Calling B");
	}
}

public class Single{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Child obj = new Child();
		obj.A();
		obj.B();
	}
}
