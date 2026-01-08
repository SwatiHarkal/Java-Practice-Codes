class Parent{
	void cat(){
	System.out.println("Its Cat");
	}
}

class Child extends Parent {
	void dog(){
		System.out.println("Its Dog");
	}
}

public class Single2{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Child obj = new Child();
		obj.cat();
		obj.dog();
	}
}
