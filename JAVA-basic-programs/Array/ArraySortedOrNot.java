package Array;

public class ArraySortedOrNot {
   static boolean sorted = false;


     static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sorted=true;
            }
            else {
                sorted=false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,8,9,7,1};
        sort(arr);

        if(sorted==true){
            System.out.println("Sorted array");
        }
        else {
            System.out.println("Array is not sorted ");
        }
    }
}
