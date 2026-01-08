class Sub{
	int sub1(int a, int b){
		int total = b - a;
		return total;
	}
}

class Child1 extends Sub {
	int sub2(int c , int d){
		int total = d - c;
		return total;
	}
}

class Child2 extends Sub {
	int sub3(int e , int f){
		int total = f - e;
		return total;
	}
}

public class Hirachical1{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child1 obj = new Child1();
		System.out.println(obj.sub1(10,20));
		System.out.println(obj.sub2(30,40));

        Child2 obj1 = new Child2();
		System.out.println(obj1.sub1(10,20));
		System.out.println(obj1.sub3(4,5));
	}
}
