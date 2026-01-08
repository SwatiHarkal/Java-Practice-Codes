class Anchor{
	void anchoring(){
		System.out.println("Anchor is anchoring");
	}
}

class Singer extends Anchor{
	void sings(){
	System.out.println("Singer is singing");
	}
}

class Dancer extends Anchor {
	void dance(){
		System.out.println("Dancer is dancing");
	}
}

public class Hirachical8{
	public static void main(String[] args){
		System.out.println("Hirachical Inheritance");
		Singer obj = new Singer();
		obj.anchoring();
		obj.sings();

		Dancer obj1 = new Dancer();
		obj1.anchoring();
		obj1.dance();
	}
}
