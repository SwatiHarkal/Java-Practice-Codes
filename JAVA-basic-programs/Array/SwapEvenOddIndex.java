package Array;

public class SwapEvenOddIndex {

    static void swapEvenOddIndex(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,2,1,6,3};

        swapEvenOddIndex(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
