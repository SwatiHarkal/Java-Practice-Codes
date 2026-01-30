package Inheritance.Hybrid;

class GrandParent6{
	void car(){
	System.out.println("Its Car");
	}
}

class Parent6 extends GrandParent6 {
	void vehical(){
		System.out.println("Its Vehical");
	}
}

class Child61 extends Parent6 {
	void thar(){
		System.out.println("Its Thar");
	}
}

class Child62 extends Parent6 {
	void cycle(){
		System.out.println("Its Bicycle");
	}
}

public class Hybrid6{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
        System.out.println("Object from Parent");
        Parent6 obj = new Parent6();
		obj.car();
		obj.vehical();

        System.out.println("Object from Cild1");
		Child61 obj1 = new Child61();
		obj1.car();
		obj1.vehical();
        obj1.thar();

        System.out.println("Object from Cild2");
		Child62 obj2 = new Child62();
		obj2.car();
		obj2.vehical();
        obj2.cycle();
	}
}
