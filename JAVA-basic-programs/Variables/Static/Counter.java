package Variables.Static;
//1. Static Variables
// Write a Java program to create a class called "Counter" with a static variable count.
// Implement a constructor that increments count every time an object is created.
// Print the value of count after creating several objects.

public class Counter {

    public static int count = 0;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter obj = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Count is " + count);

    }
}
