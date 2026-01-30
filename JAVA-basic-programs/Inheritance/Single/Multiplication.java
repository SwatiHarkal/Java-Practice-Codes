package Inheritance.Single;

class Multiply1 {
	int mul1(int a, int b){
		int total = b * a;
		return total;
	}
}

class ChildMultiply extends Multiply1 {
	int mul2(int c , int d){
		int total = d * c;
		return total;
	}
}

public class Multiplication {
	public static void main(String args[]){
		System.out.println("Multiplication Using Single Inheritance");
        ChildMultiply obj = new ChildMultiply();
		System.out.println("Total "+obj.mul1(2,20));
		System.out.println("Total "+obj.mul2(5,40));
	}
}
