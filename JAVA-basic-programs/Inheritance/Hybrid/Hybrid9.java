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

class Student1 extends Poet {
	void learn(){
		System.out.println("Student is leraning");
	}
}

class Student2 extends Poet {
	void play(){
		System.out.println("Student2 is playing");
	}
}

public class Hybrid9{
	public static void main(String args[]){
		System.out.println("Hybrid Inheritance");
		System.out.println("Object from Student1");
        Student1 obj = new Student1();
		obj.writes();
		obj.poety();
        obj.learn();

		System.out.println("Object from Student2");
        Student2 oj1 = new Student2();
        obj1.writes();
        obj1.poety();
        obj1.play();

		System.out.println("Object from Poet");
		Poet obj2 = new Poet();
		obj2.writes();
		obj2.poety();
	}
}
