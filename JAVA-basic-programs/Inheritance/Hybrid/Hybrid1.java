class GrandParent{
	int sub1(int a, int b){
		int total = b - a;
		return total;
	}
}

class Parent extends GrandParent {
	int sub2(int c , int d){
		int total = d - c;
		return total;
	}
}

class Child1 extends Parent {
	int sub3(int e , int f){
		int total = f - e;
		return total;
	}
}

class Child2 extends Parent {
	int sub4(int g , int h){
		int total = h - g;
		return total;
	}
}

public class Hybrid1{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		Child1 obj = new Child1();
        System.out.println("Object from Child1");
		System.out.println(obj.sub1(10,20));
		System.out.println(obj.sub2(30,40));
        System.out.println(obj.sub3(5,8));

        Child2 obj1 = new Child2();
        System.out.println("Object from Child2");
		System.out.println(obj1.sub1(10,20));
		System.out.println(obj1.sub2(30,40));
        System.out.println(obj1.sub4(6,8));

        Parent obj = new Parent();
        System.out.println("Object from Parent");
		System.out.println(obj.sub1(10,20));
		System.out.println(obj.sub2(30,40));
	}
}
