class GrandParent{
	void cat(){
	System.out.println("Its Cat");
	}
}

class Parent extends GrandParent {
	void mouse(){
		System.out.println("Its Mouse");
	}
}

class Child extends GrandParent {
	void dog(){
		System.out.println("Its Dog");
	}
}

public class Hirachical7{
	public static void main(String args[]){
		System.out.println("Hirachical Inheritance");
        Parent obj = new Parent();
		obj.cat();
		obj.mouse();

		Child obj1 = new Child();
		obj1.cat();
        obj1.dog();
	}
}
