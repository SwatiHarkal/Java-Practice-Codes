package Enum;
enum Color{
    RED, GREEN, BLUE;

    private Color(){
        System.out.println("Constructor called for: " + this);
    }

    public void display(){
        System.out.println("Color is: " + this);
    }
}

public class EnumConstructer{

    public static void main(String[] args){
        Color c1 = Color.GREEN;
        c1.display();
    }
}
