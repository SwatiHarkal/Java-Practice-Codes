package Inheritance.Single;

class AddSingle{
	int sum1(int a, int b){
		int total = a + b;
		return total;
	}
}

class Child extends AddSingle {
	int sum2(int c , int d){
		int total = c+d;
		return total;
	}
}

public class Addition{
	public static void main(String args[]){
		System.out.println("Addition Using Single Inheritance");
		Child obj = new Child();
		System.out.println("Addition "+obj.sum1(10,20));
		System.out.println("Addition "+obj.sum2(30,40));
	}
}
