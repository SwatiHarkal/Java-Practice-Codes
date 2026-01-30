package Inheritance.Hybrid;

class Anchor2{
	void anchoring(){
		System.out.println("Anchor is anchoring");
	}
}

class Singer extends Anchor2{
	void sings(){
	System.out.println("Singer is singing");
	}
}

class Dancer1 extends Singer {
	void classical(){
		System.out.println("Classical Dancer");
	}
}

class Dancer2 extends Singer {
	void hiphop(){
		System.out.println("Hiphop Dancer");
	}
}

public class Hybrid8{
	public static void main(String[] args){
		System.out.println("Hybrid Inheritance");
        System.out.println("Object from Singer");
		Singer obj = new Singer();
		obj.anchoring();
		obj.sings();

        System.out.println("Object from Dancer1");
		Dancer1 obj1 = new Dancer1();
		obj1.anchoring();
		obj1.sings();
		obj1.classical();

        System.out.println("Object from Dancer2");
		Dancer2 obj2 = new Dancer2();
		obj2.anchoring();
		obj2.sings();
		obj2.hiphop();
	}
}
