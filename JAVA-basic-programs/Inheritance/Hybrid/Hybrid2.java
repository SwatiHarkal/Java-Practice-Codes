class GrandParent{
	int div1(int a, int b){
		int total = b / a;
		return total;
	}
}

class Parent extends GrandParent {
	int div2(int c , int d){
		int total = d / c;
		return total;
	}
}

class Child1 extends Parent {
	int div3(int e , int f){
		int total = f / e;
		return total;
	}
}

class Child2 extends Parent {
	int div4(int g , int h){
		int total = h / g;
		return total;
	}
}

public class Hybrid2{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		Child1 obj = new Child1();
        System.out.println("Object from Child1");
		System.out.println(obj.div1(10,20));
		System.out.println(obj.div2(20,60));
        System.out.println(obj.div3(2,8));

        Child2 obj1 = new Child2();
        System.out.println("Object from Child2");
		System.out.println(obj1.div1(10,20));
		System.out.println(obj1.div2(20,60));
        System.out.println(obj1.div4(2,16));

        Parent obj = new Parent();
        System.out.println("Object from Parent");
		System.out.println(obj.div1(10,20));
		System.out.println(obj.div2(20,60));
	}
}
