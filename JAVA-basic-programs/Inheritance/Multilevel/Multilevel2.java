class GrandParent{
	void cat(){
	System.out.println("Its Cat");
	}
}

class Parent extends GrandParent {
	void mouse(){
		System.out.println("Its Mouse");
	}
}

class Child extends Parent {
	void dog(){
		System.out.println("Its Dog");
	}
}

public class Multilevel2{
	public static void main(String args[]){
		System.out.println("Multilevel Inheritance");
        Parent obj = new Parent();
		obj.cat();
		obj.mouse();

		Child obj1 = new Child();
		obj1.cat();
		obj1.mouse();
        obj1.dog();
	}
}
