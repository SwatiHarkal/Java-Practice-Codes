package Inheritance.Hybrid;

class GrandParent3{
	int mul1(int a, int b){
		int total = b * a;
		return total;
	}
}

class Parent3 extends GrandParent3 {
	int mul2(int c , int d){
		int total = d * c;
		return total;
	}
}

class Child31 extends Parent3 {
	int mul3(int e , int f){
		int total = f * e;
		return total;
	}
}

class Child32 extends Parent3 {
	int mul4(int g , int h){
		int total = h * g;
		return total;
	}
}

public class Hybrid3{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		Child31 obj = new Child31();
        System.out.println("Object from Child1");
		System.out.println(obj.mul1(10,20));
		System.out.println(obj.mul2(20,60));
        System.out.println(obj.mul3(2,8));

        Child32 obj1 = new Child32();
        System.out.println("Object from Child2");
		System.out.println(obj1.mul1(10,20));
		System.out.println(obj1.mul2(20,60));
        System.out.println(obj1.mul4(2,16));

        Parent3 obj2 = new Parent3();
        System.out.println("Object from Parent");
		System.out.println(obj.mul1(10,20));
		System.out.println(obj.mul2(20,60));
	}
}
