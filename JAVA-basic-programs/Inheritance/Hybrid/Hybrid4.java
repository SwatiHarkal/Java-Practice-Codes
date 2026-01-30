package Inheritance.Hybrid;

class GrandParent4 {
	int mod1(int a, int b){
		int total = b % a;
		return total;
	}
}

class Parent4 extends GrandParent4 {
	int mod2(int c , int d){
		int total = d % c;
		return total;
	}
}

class Child41 extends Parent4 {
	int mod3(int e , int f){
		int total = f % e;
		return total;
	}
}

class Child42 extends Parent4 {
	int mod4(int g , int h){
		int total = h % g;
		return total;
	}
}

public class Hybrid4{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		Child41 obj = new Child41();
        System.out.println("Object from Child1");
		System.out.println(obj.mod1(10,23));
		System.out.println(obj.mod2(20,65));
        System.out.println(obj.mod3(2,19));

        Child42 obj1 = new Child42();
        System.out.println("Object from Child2");
		System.out.println(obj1.mod1(10,23));
		System.out.println(obj1.mod2(20,65));
        System.out.println(obj1.mod4(2,15));

        Parent4 obj2 = new Parent4();
        System.out.println("Object from Parent");
		System.out.println(obj2.mod1(10,23));
		System.out.println(obj2.mod2(20,65));
	}
}
