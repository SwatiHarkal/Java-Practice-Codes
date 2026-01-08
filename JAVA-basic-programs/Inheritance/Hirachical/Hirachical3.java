class Multiply{
	int mul1(int a, int b){
		int total = b * a;
		return total;
	}
}

class Child1 extends Multiply {
	int mul2(int c , int d){
		int total = d * c;
		return total;
	}
}

class Child2 extends Multiply {
	int mul3(int e , int f){
		int total = f * e;
		return total;
	}
}

public class Hirachical3{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child1 obj = new Child1();
		System.out.println(obj.mul1(10,20));
		System.out.println(obj.mul2(4,40));

        Child2 obj1 = new Child2();
		System.out.println(obj1.mul1(10,20));
		System.out.println(obj1.mul3(5,15));
	}
}
