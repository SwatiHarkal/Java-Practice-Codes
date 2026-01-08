class GrandParent{
	int mul1(int a, int b){
		int total = b * a;
		return total;
	}
}

class Parent extends GrandParent {
	int mul2(int c , int d){
		int total = d * c;
		return total;
	}
}

class Child extends Parent {
	int mul3(int e , int f){
		int total = f * e;
		return total;
	}
}

public class Multiplication{
	public static void main(String args[]){
		System.out.println("Multiplication Using Multilevel Inheritance");
		Child obj = new Child();
		obj.mul1(10,20);
		obj.mul2(30,40);
        obj.mul3(4,5);
	}
}
