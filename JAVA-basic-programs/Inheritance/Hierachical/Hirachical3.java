package Inheritance.Hierachical;

class Multiply3 {
	int mul1(int a, int b){
		int total = b * a;
		return total;
	}
}

class Child31 extends Multiply3 {
	int mul2(int c , int d){
		int total = d * c;
		return total;
	}
}

class Child32 extends Multiply3 {
	int mul3(int e , int f){
		int total = f * e;
		return total;
	}
}

public class Hirachical3{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child31 obj = new Child31();
		System.out.println(obj.mul1(10,20));
		System.out.println(obj.mul2(4,40));

        Child32 obj1 = new Child32();
		System.out.println(obj1.mul1(10,20));
		System.out.println(obj1.mul3(5,15));
	}
}
