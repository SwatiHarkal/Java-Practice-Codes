package Inheritance.Hierachical;

class Writer1{
	void writes(){
	System.out.println("Writer is writing book");
	}
}

class Poet1 extends Writer1 {
	void poety(){
		System.out.println("Poet writing Poetry");
	}
}

class Student1 extends Writer1 {
	void learn(){
		System.out.println("Student is leraning");
	}
}

public class Hirachical9{
	public static void main(String args[]){
		System.out.println("Hiracical Inheritance");
        Student1 obj = new Student1();
		obj.writes();
		obj.learn();

		Poet1 obj1 = new Poet1();
		obj1.writes();
        obj1.poety();
	}
}
