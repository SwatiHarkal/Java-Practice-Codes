package AccessModifires.P1;

class Display{
    void show(){
        System.out.println("Default method");
    }
}

public class DefaultClass {
    public static void main(String[] args) {
        Display d = new Display();
        d.show();
        String name = "Swati";
    }
}
