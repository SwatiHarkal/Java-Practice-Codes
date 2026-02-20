package Array.Patterns;

public class RightHalfPyramid {
    void pritnthalfpyramid(int n){
        int i, j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightHalfPyramid rp = new RightHalfPyramid();
        rp.pritnthalfpyramid(5);
    }
}
