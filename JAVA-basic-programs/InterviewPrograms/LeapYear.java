package InterviewPrograms;

import java.util.Scanner;

public class LeapYear {
    boolean checkYear(int y) {
        if(y%4==0){
//            if(y%100 == 0){
//                return y % 400 == 0;
//            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        LeapYear obj=new LeapYear();
        if (obj.checkYear(year)) {
            System.out.println("Entered Year is a leap year");
        } else {
            System.out.println("Entered Year is not a leap year");
        }
    }
}


//public class LeapYear {
//    Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter a Year");
//    int year = scanner.nextInt();
//
//    boolean isLeapYear(int year){
//        return false;
//    }
//
//    public static void main(String[] args) {}
//}
