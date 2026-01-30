package Inheritance.Multilevel;

class GrandParentMod{
	int mod1(int a, int b){
		int total = b / a;
		return total;
	}
}

class ParentMod extends GrandParentMod {
	int mod2(int c , int d){
		int total = d / c;
		return total;
	}
}

class ChildMod extends ParentMod {
	int mod3(int e , int f){
		int total = f / e;
		return total;
	}
}

public class Modulus{
	public static void main(String args[]){
		System.out.println("Modulus Using Multilevel Inheritance");
        ChildMod obj = new ChildMod();
		obj.mod1(10,22);
		obj.mod2(2,47);
        obj.mod3(4,29);
	}
}
