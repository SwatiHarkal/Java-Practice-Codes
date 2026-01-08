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

class Student extends Writer {
	void learn(){
		System.out.println("Student is leraning");
	}
}

public class Hiracical9{
	public static void main(String args[]){
		System.out.println("Hiracical Inheritance");
        Student obj = new Student();
		obj.writes();
		obj.poety();

		Poet obj1 = new Poet();
		obj1.writes();
        obj1.learn();
	}
}
