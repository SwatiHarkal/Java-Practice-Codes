package Array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] newArr = new int[arr.length-1];

        int element = 20;
        for(int i=0, j=0;i<arr.length;i++){
            if(arr[i]!=element){
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println("New Array is: " + Arrays.toString(newArr));
    }
}
