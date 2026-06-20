package InterviewPrograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Series till entered Number");

        for(int i =1; i<=n; ++i){
            System.out.print(firstTerm +" ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
