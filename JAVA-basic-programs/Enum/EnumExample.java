package Enum;

enum Enums {
    LOW, MEDIUM, HIGH;
}

public class EnumExample {
    public static void main(String[] args) {
        Enums myVar = Enums.LOW;
        System.out.println(Enums.LOW.ordinal()); //to get order number
        System.out.println(myVar);
    }
}
