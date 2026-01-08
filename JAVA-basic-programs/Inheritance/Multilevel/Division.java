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

class Child extends Parent {
	int div3(int e , int f){
		int total = f / e;
		return total;
	}
}

public class Division{
	public static void main(String args[]){
		System.out.println("Division Using Multilevel Inheritance");
		Child obj = new Child();
		obj.div1(10,20);
		obj.div2(2,40);
        obj.div3(4,24);
	}
}
