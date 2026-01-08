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

public class Single4{
	public static void main(String args[]){
		System.out.println("Single Inheritance");
		Poet obj = new Poet();
		obj.writes();
		obj.poety();
	}
}
