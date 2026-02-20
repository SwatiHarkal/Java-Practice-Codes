package Variables.Static;

//2. Static Methods
// Write a Java program to create a class called "MathUtility"
// with a static method add that takes two integers and returns their sum.
// Demonstrate the usage of this static method in the main method
// without creating an instance of "MathUtility".

public class MathUtility {
    static int add(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {

        System.out.println("Addition from static method: " + add(2,3));
    }
}
