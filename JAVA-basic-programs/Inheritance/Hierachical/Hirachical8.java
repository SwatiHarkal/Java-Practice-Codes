package Inheritance.Hierachical;

class Anchor1 {
	void anchoring(){
		System.out.println("Anchor is anchoring");
	}
}

class Singer1 extends Anchor1 {
	void sings(){
	System.out.println("Singer is singing");
	}
}

class Dancer1 extends Anchor1 {
	void dance(){
		System.out.println("Dancer is dancing");
	}
}

public class Hirachical8{
	public static void main(String[] args){
		System.out.println("Hirachical Inheritance");
		Singer1 obj = new Singer1();
		obj.anchoring();
		obj.sings();

		Dancer1 obj1 = new Dancer1();
		obj1.anchoring();
		obj1.dance();
	}
}
