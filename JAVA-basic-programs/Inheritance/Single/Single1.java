package Inheritance.Single;

class Parent1{
	void car(){
	System.out.println("Its Car");
	}
}

class Child11 extends Parent1 {
	void vehical(){
		System.out.println("Its Vehical");
	}
}

public class Single1{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Child11 obj = new Child11();
		obj.car();
		obj.vehical();
	}
}
