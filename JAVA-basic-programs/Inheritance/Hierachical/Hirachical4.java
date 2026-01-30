package Inheritance.Hierachical;

class Modulus4 {
	int mod1(int a, int b){
		int total = b % a;
		return total;
	}
}

class Child41 extends Modulus4 {
	int mod2(int c , int d){
		int total = d % c;
		return total;
	}
}

class Child42 extends Modulus4 {
	int mod3(int e , int f){
		int total = f % e;
		return total;
	}
}

public class Hirachical4{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child41 obj = new Child41();
		System.out.println(obj.mod1(10,25));
		System.out.println(obj.mod2(4,48));

        Child42 obj1 = new Child42();
		System.out.println(obj1.mod1(10,25));
		System.out.println(obj1.mod3(5,19));
	}
}
