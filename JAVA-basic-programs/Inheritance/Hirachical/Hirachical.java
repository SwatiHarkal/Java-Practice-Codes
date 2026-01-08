class Add{
	int sum1(int a, int b){
		int total = a + b;
		return total;
	}
}

class Child1 extends Add {
	int sum2(int c , int d){
		int total = c+d;
		return total;
	}
}

class Child2 extends Add {
	int sum3(int e , int f){
		int total = e+f;
		return total;
	}
}

public class Hirachical{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child1 obj = new Child1();
		System.out.println(obj.sum1(10,20));
		System.out.println(obj.sum2(30,40));

        Child2 obj1 = new Child2();
		System.out.println(obj1.sum1(10,20));
		System.out.println(obj1.sum3(5,4));
	}
}
