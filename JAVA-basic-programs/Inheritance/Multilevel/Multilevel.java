package Inheritance.Multilevel;

class GrandParentMulti{
	void A(){
	System.out.println("Calling A");
	}
}

class ParentMulti extends GrandParentMulti {
	void B(){
		System.out.println("Calling B");
	}
}

class ChildMulti extends ParentMulti {
	void C(){
		System.out.println("Calling C");
	}
}

public class Multilevel{
	public static void main(String args[]){
		System.out.println("Multilevel Inheritance");
        ParentMulti obj = new ParentMulti();
		obj.A();
		obj.B();

		ChildMulti obj1 = new ChildMulti();
		obj1.A();
		obj1.B();
        obj1.C();
	}
}
