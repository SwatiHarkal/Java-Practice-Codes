package Inheritance.Multilevel;

class Writer4{
	void writes(){
	System.out.println("Writer is writing book");
	}
}

class Poet extends Writer4 {
	void poety(){
		System.out.println("Poet writing Poetry");
	}
}

class Student extends Poet {
	void learn(){
		System.out.println("Student is leraning");
	}
}

public class Multilevel4{
	public static void main(String args[]){
		System.out.println("Multilevel Inheritance");
        Student obj = new Student();
		obj.writes();
		obj.poety();

		Poet obj1 = new Poet();
		obj1.writes();
		obj1.poety();
	}
}
