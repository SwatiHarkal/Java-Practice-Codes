package Inheritance.Hybrid;

class GrandParent22{
	int div1(int a, int b){
		int total = b / a;
		return total;
	}
}

class Parent2 extends GrandParent22 {
	int div2(int c , int d){
		int total = d / c;
		return total;
	}
}

class Child21 extends Parent2 {
	int div3(int e , int f){
		int total = f / e;
		return total;
	}
}

class Child22 extends Parent2 {
	int div4(int g , int h){
		int total = h / g;
		return total;
	}
}

public class Hybrid2{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		Child21 obj = new Child21();
        System.out.println("Object from Child1");
		System.out.println(obj.div1(10,20));
		System.out.println(obj.div2(20,60));
        System.out.println(obj.div3(2,8));

        Child22 obj1 = new Child22();
        System.out.println("Object from Child2");
		System.out.println(obj1.div1(10,20));
		System.out.println(obj1.div2(20,60));
        System.out.println(obj1.div4(2,16));

        Parent2 obj2 = new Parent2();
        System.out.println("Object from Parent2");
		System.out.println(obj2.div1(10,20));
		System.out.println(obj2.div2(20,60));
	}
}
