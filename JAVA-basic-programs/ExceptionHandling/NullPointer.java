package ExceptionHandling;

import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       // System.out.print("Enter an String: ");
        String s = null;
        try {
                System.out.println(s.length());
        }
        catch(NullPointerException npe){
            System.out.println("Null Pointer Exception");
        }
    }
}
