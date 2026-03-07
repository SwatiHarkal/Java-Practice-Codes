package Array;

public class FindMissingElement {

    static void findMissingElement(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])!=1){
                System.out.println(arr[i]+1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9};
        findMissingElement(arr);
    }
}
