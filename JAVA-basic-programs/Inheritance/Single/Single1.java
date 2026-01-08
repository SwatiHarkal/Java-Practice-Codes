class Parent{
	void car(){
	System.out.println("Its Car");
	}
}

class Child extends Parent {
	void vehical(){
		System.out.println("Its Vehical");
	}
}

public class Single1{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Child obj = new Child();
		obj.car();
		obj.vehical();
	}
}
