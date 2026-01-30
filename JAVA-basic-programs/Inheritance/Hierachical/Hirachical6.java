package Inheritance.Hierachical;

class GrandParent6 {
	void car(){
	System.out.println("Its Car");
	}
}

class Parent6 extends GrandParent6 {
	void vehical(){
		System.out.println("Its Vehical");
	}
}

class Child61 extends GrandParent6 {
	void thar(){
		System.out.println("Its Thar");
	}
}

public class Hirachical6{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
        Parent6 obj = new Parent6();
		obj.car();
		obj.vehical();

		Child61 obj1 = new Child61();
		obj1.car();
        obj1.thar();
	}
}
