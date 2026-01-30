package Inheritance.Multilevel;

class Anchor3{
	void anchoring(){
		System.out.println("Anchor is anchoring");
	}
}

class Singer extends Anchor3{
	void sings(){
	System.out.println("Singer is singing");
	}
}

class Dancer extends Singer {
	void dance(){
		System.out.println("Dancer is dancing");
	}
}

public class Multilevel3{
	public static void main(String[] args){
		System.out.println("multilevel Inheritance");
		Singer obj = new Singer();
		obj.anchoring();
		obj.sings();

		Dancer obj1 = new Dancer();
		obj1.anchoring();
		obj1.sings();
		obj1.dance();
	}
}
