package Array.Patterns;

public class SquareFillpattern {
    void squareFillpattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareFillpattern sfp = new SquareFillpattern();
        sfp.squareFillpattern(4);
    }
}
