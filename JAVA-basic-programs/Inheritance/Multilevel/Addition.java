package Inheritance.Multilevel;

class GrandParent3{
	int sum1(int a, int b){
		int total = a + b;
		return total;
	}
}

class Parent extends GrandParent3 {
	int sum2(int c , int d){
		int total = c+d;
		return total;
	}
}

class Child extends Parent {
	int sum3(int e , int f){
		int total = e+f;
		return total;
	}
}

public class Addition{
	public static void main(String args[]){
		System.out.println("Addition Using Multilevel Inheritance");
		Child obj = new Child();
		System.out.println("Addition "+obj.sum1(10,20));
		System.out.println("Addition "+obj.sum2(30,40));
        System.out.println("Addition "+obj.sum3(5,4));
	}
}
