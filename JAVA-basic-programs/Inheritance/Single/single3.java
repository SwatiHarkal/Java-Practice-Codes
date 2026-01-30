package Inheritance.Single;

class Singer4{
	void sings(){
	System.out.println("Singer is singing");
	}
}

class Dancer extends Singer4 {
	void dance(){
		System.out.println("Dancer is dancing");
	}
}

public class single3{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Dancer obj = new Dancer();
		obj.sings();
		obj.dance();
	}
}
