package Inheritance.Hierachical;

class Div1 {
	int div1(int a, int b){
		int total = b / a;
		return total;
	}
}

class Child21 extends Div1 {
	int div2(int c , int d){
		int total = d / c;
		return total;
	}
}

class Child22 extends Div1 {
	int div3(int e , int f){
		int total = f / e;
		return total;
	}
}

public class Hirachical2{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child21 obj = new Child21();
		System.out.println(obj.div1(10,20));
		System.out.println(obj.div2(4,40));

        Child22 obj1 = new Child22();
		System.out.println(obj1.div1(10,20));
		System.out.println(obj1.div3(5,15));
	}
}
