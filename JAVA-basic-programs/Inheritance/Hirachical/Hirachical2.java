class Div{
	int div1(int a, int b){
		int total = b / a;
		return total;
	}
}

class Child1 extends Div {
	int div2(int c , int d){
		int total = d / c;
		return total;
	}
}

class Child2 extends Div {
	int div3(int e , int f){
		int total = f / e;
		return total;
	}
}

public class Hirachical2{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child1 obj = new Child1();
		System.out.println(obj.div1(10,20));
		System.out.println(obj.div2(4,40));

        Child2 obj1 = new Child2();
		System.out.println(obj1.div1(10,20));
		System.out.println(obj1.div3(5,15));
	}
}
