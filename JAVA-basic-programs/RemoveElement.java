package Array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] newArr = new int[arr.length-1];

        int element = 20;
        for(int i=0, j=0;i<arr.length;i++){//i=2  j=1
                    if(arr[i]!=element){
                        newArr[j] = arr[i];//10 newArr[1] = arr[2] //30
                        j++;
            }
        }
        System.out.println("New Array is: " + Arrays.toString(newArr));
    }
}
