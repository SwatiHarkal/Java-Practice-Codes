class Parent1{
	long mod1(int a, int b){
		long total = b % a;
		return total;
	}
}

class Child extends Parent1 {
	long mod2(int c , int d){
		long total = d % c;
		return total;
	}
}

public class Modulus{
	public static void main(String args[]){
		System.out.println("Modulus Using Single Inheritance");
		Child obj = new Child();
		System.out.println("Total "+obj.mod1(2,21));
		System.out.println("Total "+obj.mod2(5,43));
	}
}
