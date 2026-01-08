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

class Child1 extends Parent {
	void dog(){
		System.out.println("Its Dog");
	}
}

class Child2 extends Parent {
	void cow(){
		System.out.println("Its Cow");
	}
}

public class Hybrid7{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
        System.out.println("Objec from Parent");
        Parent obj = new Parent();
		obj.cat();
		obj.mouse();

        System.out.println("Objec from Cild1");
		Child1 obj1 = new Child1();
		obj1.cat();
		obj1.mouse();
        obj1.dog();

        System.out.println("Objec from Cild2");
		Child1 obj2 = new Child1();
		obj2.cat();
		obj2.mouse();
        obj2.cow();
	}
}
