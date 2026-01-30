package Inheritance.Single;

class Sub1 {
	int sub1(int a, int b){
		int total = b - a;
		return total;
	}
}

class ChildSub extends Sub1 {
	int sub2(int c , int d){
		int total = d - c;
		return total;
	}
}

public class Substraction {
	public static void main(String args[]){
		System.out.println("Subsraction Using Single Inheritance");
        ChildSub obj = new ChildSub();
		System.out.println("Total "+obj.sub1(10,20));
		System.out.println("Total "+obj.sub2(30,40));
	}
}
