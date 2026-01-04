package Array;

public class Sumarroddindex {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,10};
       //1 2 3 4 5 6 7 8 9 10
       //0 1 2 3 4 5 6 7 8 9

       int sum = 0;

       for(int i=0; i<arr.length; i++) {
           if(i%2!=0){
            sum += arr[i];
           }
       }
       System.out.println("odd index sum:" +sum);
    }
}
