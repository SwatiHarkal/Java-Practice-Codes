class Multiply{
	int mul1(int a, int b){
		int total = b * a;
		return total;
	}
}

class Child extends Multiply {
	int mul2(int c , int d){
		int total = d * c;
		return total;
	}
}

public class Multiplication{
	public static void main(String args[]){
		System.out.println("Multiplication Using Single Inheritance");
		Child obj = new Child();
		System.out.println("Total "+obj.mul1(2,20));
		System.out.println("Total "+obj.mul2(5,40));
	}
}
