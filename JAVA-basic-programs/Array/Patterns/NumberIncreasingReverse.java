package Array.Patterns;

public class NumberIncreasingReverse {
    int i,j;
    void increasenumber(int n){
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        NumberIncreasingReverse obj = new NumberIncreasingReverse();
        obj.increasenumber(6);
    }
}
