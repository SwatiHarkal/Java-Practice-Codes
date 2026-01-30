package Inheritance.Multilevel;

class GrandParentSub{
	int sub1(int a, int b){
		int total = b - a;
		return total;
	}
}

class ParentSub extends GrandParentSub {
	int sub2(int c , int d){
		int total = d - c;
		return total;
	}
}

class ChildSub extends ParentSub {
	int sub3(int e , int f){
		int total = f - e;
		return total;
	}
}

public class Substraction{
	public static void main(String args[]){
		System.out.println("Substraction Using Multilevel Inheritance");
		ChildSub obj = new ChildSub();
		obj.sub1(10,20);
		obj.sub2(30,40);
        obj.sub3(4,5);
	}
}
