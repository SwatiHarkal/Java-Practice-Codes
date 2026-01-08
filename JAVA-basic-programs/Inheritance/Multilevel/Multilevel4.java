class Writer{
	void writes(){
	System.out.println("Writer is writing book");
	}
}

class Poet extends Writer {
	void poety(){
		System.out.println("Poet writing Poetry");
	}
}

class Student extends Poet {
	void learn(){
		System.out.println("Student is leraning");
	}
}

public class multilevel4{
	public static void main(String args[]){
		System.out.println("Multilevel Inheritance");
        Student obj = new Student();
		obj.writes();
		obj.poety();

		Poet obj1 = new Poet();
		obj1.writes();
		obj1.poety();
        obj1.learn();
	}
}
