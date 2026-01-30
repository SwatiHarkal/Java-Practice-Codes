package Inheritance.Single;

class ParentSingle{
	void A(){
	System.out.println("Calling A");
	}
}

class ChildSingle extends ParentSingle {
	void B(){
		System.out.println("Calling B");
	}
}

public class Single{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
        ChildSingle obj = new ChildSingle();
		obj.A();
		obj.B();
	}
}
