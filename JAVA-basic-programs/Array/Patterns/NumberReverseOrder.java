package Array.Patterns;

public class NumberReverseOrder {

    void increasePyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberReverseOrder p = new NumberReverseOrder();
        p.increasePyramid(4);
    }
}
