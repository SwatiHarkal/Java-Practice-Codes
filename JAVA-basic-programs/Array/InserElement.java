package Array;
import java.util.Arrays;

public class InserElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        int element = 25;
        int position = 2;

        int[] newArr = new int[arr.length+1];

        for(int i = 0; i < newArr.length; i++) {
            if (i<position) {
                newArr[i] = arr[i];
            }
            else if (i == position){
                newArr[i] = element;
            }
            else {
                newArr[i] = arr[i-1];
            }
        }
        System.out.println("Old Array is: " +Arrays.toString(arr));
        System.out.println("New Array is: " +Arrays.toString(newArr));
    }
}
