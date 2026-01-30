package Array;

public class CopyArray {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        int[] newArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
            System.out.print(newArr[i] + " ");
        }

    }
}
