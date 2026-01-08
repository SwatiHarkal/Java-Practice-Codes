class GrandParent{
	void car(){
	System.out.println("Its Car");
	}
}

class Parent extends GrandParent {
	void vehical(){
		System.out.println("Its Vehical");
	}
}

class Child1 extends Parent {
	void thar(){
		System.out.println("Its Thar");
	}
}

class Child2 extends Parent {
	void cycle(){
		System.out.println("Its Bicycle");
	}
}

public class Hybrid6{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
        System.out.println("Object from Parent");
        Parent obj = new Parent();
		obj.car();
		obj.vehical();

        System.out.println("Object from Cild1");
		Child1 obj1 = new Child1();
		obj1.car();
		obj1.vehical();
        obj1.thar();

        System.out.println("Object from Cild2");
		Child2 obj2 = new Child2();
		obj2.car();
		obj2.vehical();
        obj2.cycle();
	}
}
