package Inheritance.Single;

class Parent2{
	void cat(){
	System.out.println("Its Cat");
	}
}

class Childnew extends Parent2 {
	void dog(){
		System.out.println("Its Dog");
	}
}

public class Single2{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Childnew obj = new Childnew();
		obj.cat();
		obj.dog();
	}
}
