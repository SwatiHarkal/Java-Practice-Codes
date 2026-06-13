package Array;

import java.util.Scanner;

public class ArrSortedornot {
    static boolean sorted = false;
    static void isSorted(int[] arr) {
        //your code goes here
        for(int i = 0; i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    sorted = true;
                }
                else{
                    sorted = false;
                    break;
                }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter "+size + " elements: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        isSorted(arr);

        if(sorted==true){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }

    }
}
