class Sub{
	int sub1(int a, int b){
		int total = b - a;
		return total;
	}
}

class Child extends Sub {
	int sub2(int c , int d){
		int total = d - c;
		return total;
	}
}

public class Substraction{
	public static void main(String args[]){
		System.out.println("Subsraction Using Single Inheritance");
		Child obj = new Child();
		System.out.println("Total "+obj.sub1(10,20));
		System.out.println("Total "+obj.sub2(30,40));
	}
}
