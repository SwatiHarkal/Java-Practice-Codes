package Inheritance.Hybrid;

class GrandParent1{
	int sub1(int a, int b){
		int total = b - a;
		return total;
	}
}

class Parent1 extends GrandParent1 {
	int sub2(int c , int d){
		int total = d - c;
		return total;
	}
}

class Child11 extends Parent1 {
	int sub3(int e , int f){
		int total = f - e;
		return total;
	}
}

class Child12 extends Parent1 {
	int sub4(int g , int h){
		int total = h - g;
		return total;
	}
}

public class Hybrid1{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		Child11 obj = new Child11();
        System.out.println("Object from Child1");
		System.out.println(obj.sub1(10,20));
		System.out.println(obj.sub2(30,40));
        System.out.println(obj.sub3(5,8));

        Child12 obj1 = new Child12();
        System.out.println("Object from Child2");
		System.out.println(obj1.sub1(10,20));
		System.out.println(obj1.sub2(30,40));
        System.out.println(obj1.sub4(6,8));

        Parent1 obj2 = new Parent1();
        System.out.println("Object from Parent");
		System.out.println(obj2.sub1(10,20));
		System.out.println(obj2.sub2(30,40));
	}
}
