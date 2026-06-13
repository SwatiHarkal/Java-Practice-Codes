package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {
    void isPrimt(int n){

        if(n<=1){
            System.out.println("Not a prime number");
        }

        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.println("Not a prime number");
                break;
            }
            System.out.println("Prime Number: "+n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        PrimeNumber p = new PrimeNumber();
        p.isPrimt(n);
    }
}
