package ExceptionHandling;
import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class TestClass {
    int age;

    void validate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("You are not eligible for voting");
            } else {
                System.out.println("Welcome to voting");
            }
        }
        catch(InvalidAgeException npe){
            System.out.println(npe);
        }
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Name: " +name);
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.validate();

    }

}
