package Inheritance.Single;

class DivSigle{
	int div1(int a, int b){
		int total = b / a;
		return total;
	}
}

class ChildDiv extends DivSigle {
	int div2(int c , int d){
		int total = d / c;
		return total;
	}
}

public class Division{
	public static void main(String args[]){
		System.out.println("Division Using Single Inheritance");
        ChildDiv obj = new ChildDiv();
		System.out.println("Total "+obj.div1(2,20));
		System.out.println("Total "+obj.div2(5,40));
	}
}
