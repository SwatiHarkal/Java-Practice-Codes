package Inheritance.Hybrid;

class GrandParent {
	int sum1(int a, int b){
		int total = a + b;
		return total;
	}
}

class Parent extends GrandParent {
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

class ChildHybrid extends Parent {
	int sum4(int g , int h){
		int total = g+h;
		return total;
	}
}

public class Hybrid{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		Child obj = new Child();
        System.out.println("Object from Child1");
		System.out.println(obj.sum1(10,20));
		System.out.println(obj.sum2(30,40));
        System.out.println(obj.sum3(5,4));

        ChildHybrid obj1 = new ChildHybrid();
        System.out.println("Object from Child2");
		System.out.println(obj1.sum1(10,20));
		System.out.println(obj1.sum2(30,40));
        System.out.println(obj1.sum4(6,8));

        Parent obj2 = new Parent();
        System.out.println("Object from Parent");
		System.out.println(obj2.sum1(10,20));
		System.out.println(obj2.sum2(30,40));
	}
}
