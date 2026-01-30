package Inheritance.Multilevel;

class GrandParent2{
	void cat(){
	System.out.println("Its Cat");
	}
}

class Parent2 extends GrandParent2 {
	void mouse(){
		System.out.println("Its Mouse");
	}
}

class Child21 extends Parent2 {
	void dog(){
		System.out.println("Its Dog");
	}
}

public class Multilevel2{
	public static void main(String args[]){
		System.out.println("Multilevel Inheritance");
        Parent2 obj = new Parent2();
		obj.cat();
		obj.mouse();

		Child21 obj1 = new Child21();
		obj1.cat();
		obj1.mouse();
        obj1.dog();
	}
}
