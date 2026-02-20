package Array.Patterns;

public class SquareHallow {
    int i,j;

    void squarehallow(int n){
        for(i=0; i<n; i++){
            for(j=0; j<n;j++){
                if(i==0 || j==0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        SquareHallow s = new SquareHallow();
        s.squarehallow(n);

    }

}
