package Inheritance.Multilevel;

class GrandParent1 {
	void car(){
	System.out.println("Its Car");
	}
}

class Parent1 extends GrandParent1 {
	void vehical(){
		System.out.println("Its Vehical");
	}
}

class Child11 extends Parent1 {
	void thar(){
		System.out.println("Its Thar");
	}
}

public class Multilevel1{
	public static void main(String args[]){
		System.out.println("Multilevel Inheritance");
        Parent1 obj = new Parent1();
		obj.car();
		obj.vehical();

		Child11 obj1 = new Child11();
		obj1.car();
		obj1.vehical();
        obj1.thar();
	}
}
