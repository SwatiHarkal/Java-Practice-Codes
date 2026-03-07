package Array.Patterns;

public class PatternClass {

    void increasePyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternClass p = new PatternClass();
        p.increasePyramid(4);
    }
}
