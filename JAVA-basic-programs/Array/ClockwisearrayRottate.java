package Array;

public class ClockwisearrayRottate {
    static  void rotateArray(int[] arr, int d) {
        for(int i=0;i<d;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }


    public static void main(String[] args) {
        int[] arr = {7,4,2,1,6,3};
        int d = 2;

        rotateArray(arr,d);

        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
