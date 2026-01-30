package Inheritance.Hierachical;

class GrandParent7 {
	void cat(){
	System.out.println("Its Cat");
	}
}

class Parent7 extends GrandParent7 {
	void mouse(){
		System.out.println("Its Mouse");
	}
}

class Child71 extends GrandParent7 {
	void dog(){
		System.out.println("Its Dog");
	}
}

public class Hirachical7{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
        Parent7 obj = new Parent7();
		obj.cat();
		obj.mouse();

		Child71 obj1 = new Child71();
		obj1.cat();
        obj1.dog();
	}
}
