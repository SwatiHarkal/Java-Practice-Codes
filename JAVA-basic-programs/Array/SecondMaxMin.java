package Array;

public class SecondMaxMin{
    public static void main(String args[]){
        int[] arr = {2,4,8,6,9,7,1};

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("\nSecond largest: "+arr[arr.length-2]);
        System.out.println("Smallest: "+arr[0]);
        System.out.println("Second smallest: "+arr[1]);
    }
}
