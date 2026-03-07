package Array.Patterns;

public class NumberDecreasingPyramid {
    int i,j;
    void reversenumber(int n){
        for(i=n;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        NumberDecreasingPyramid obj = new NumberDecreasingPyramid();
        obj.reversenumber(6);
    }
}
