package Inheritance.Hierachical;

class Sub1{
	int sub1(int a, int b){
		int total = b - a;
		return total;
	}
}

class Child11 extends Sub1 {
	int sub2(int c , int d){
		int total = d - c;
		return total;
	}
}

class Child12 extends Sub1 {
	int sub3(int e , int f){
		int total = f - e;
		return total;
	}
}

public class Hirachical1{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
		Child11 obj = new Child11();
		System.out.println(obj.sub1(10,20));
		System.out.println(obj.sub2(30,40));

        Child12 obj1 = new Child12();
		System.out.println(obj1.sub1(10,20));
		System.out.println(obj1.sub3(4,5));
	}
}
