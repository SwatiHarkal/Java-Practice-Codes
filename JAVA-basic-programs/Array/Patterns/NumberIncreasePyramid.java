package Array.Patterns;

public class NumberIncreasePyramid {

    void increasePyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberIncreasePyramid p = new NumberIncreasePyramid();
        p.increasePyramid(4);
    }
}
