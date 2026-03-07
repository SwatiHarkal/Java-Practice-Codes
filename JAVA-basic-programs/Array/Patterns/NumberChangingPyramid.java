package Array.Patterns;

public class NumberChangingPyramid {
    int i,j;
    int num=1;

    void numberchange(int n) {
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberChangingPyramid p = new NumberChangingPyramid();
        p.numberchange(5);
    }
}
