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

class Child extends GrandParent {
	void thar(){
		System.out.println("Its Thar");
	}
}

public class Hirachical6{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
        Parent obj = new Parent();
		obj.car();
		obj.vehical();

		Child obj1 = new Child();
		obj1.car();
        obj1.thar();
	}
}
