class Singer{
	void sings(){
	System.out.println("Singer is singing");
	}
}

class Dancer extends Singer {
	void dance(){
		System.out.println("Dancer is dancing");
	}
}

public class Single3{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Dancer obj = new Dancer();
		obj.sings();
		obj.dance();
	}
}
