package Array.Patterns;

public class TopHalfPyramid {
    void pritntlefthalfpyramid(int n){
        int i, j;
        for(i=n-1;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TopHalfPyramid rp = new TopHalfPyramid();
        rp.pritntlefthalfpyramid(5);
    }
}