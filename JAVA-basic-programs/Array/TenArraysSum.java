package Array;

public class TenArraysSum{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,2,3,5,5};

        int sum=0, element = 30;
        for(int i = 0; i<9;i++){
            sum+=arr[i];
        }
        if(sum==30){
            System.out.println("sum of all the 10's in the array is exactly 30");
        }
        else{
             System.out.println("sum of all the 10's in the array is not 30");
        }
    }
}
