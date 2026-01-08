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

class Child extends Parent {
	int sub3(int e , int f){
		int total = f - e;
		return total;
	}
}

public class Substraction{
	public static void main(String args[]){
		System.out.println("Substraction Using Multilevel Inheritance");
		Child obj = new Child();
		obj.sum1(10,20);
		obj.sum2(30,40);
        obj.sum3(4,5);
	}
}
