package Inheritance.Multilevel;

class GrandParentDiv {
	int div1(int a, int b){
		int total = b / a;
		return total;
	}
}

class ParentDiv extends GrandParentDiv {
	int div2(int c , int d){
		int total = d / c;
		return total;
	}
}

class ChildDiv extends ParentDiv {
	int div3(int e , int f){
		int total = f / e;
		return total;
	}
}

public class Division{
	public static void main(String args[]){
		System.out.println("Division Using Multilevel Inheritance");
		ChildDiv obj = new ChildDiv();
		obj.div1(10,20);
		obj.div2(2,40);
        obj.div3(4,24);
	}
}
