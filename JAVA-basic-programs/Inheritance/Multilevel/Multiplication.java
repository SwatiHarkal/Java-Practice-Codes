package Inheritance.Multilevel;

class GrandParent4{
	int mul1(int a, int b){
		int total = b * a;
		return total;
	}
}

class Parent4 extends GrandParent4 {
	int mul2(int c , int d){
		int total = d * c;
		return total;
	}
}

class Child41 extends Parent4 {
	int mul3(int e , int f){
		int total = f * e;
		return total;
	}
}

public class Multiplication{
	public static void main(String args[]){
		System.out.println("Multiplication Using Multilevel Inheritance");
		Child41 obj = new Child41();
		obj.mul1(10,20);
		obj.mul2(30,40);
        obj.mul3(4,5);
	}
}
