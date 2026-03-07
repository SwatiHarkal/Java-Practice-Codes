package Array;

public class PrintHighestSumPair {
    static void sortArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,2,1,6,3};
        sortArray(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        int a = arr[arr.length-1];
        int b = arr[arr.length-2];
        int c = a+b;
        System.out.println();
        System.out.println("Sum of highest pairs: "+c);
    }
}
