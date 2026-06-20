package Java8;
// functional interface contains only one abstract method
@FunctionalInterface
interface Add {
    int addition(int a,int b);
}

public class LambaExpression {
    public static void main(String[] args) {
        Add add = (a, b) -> {
            try{
                float result = a/b;
                System.out.println(result);
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            return a+b;
        };
        int result = add.addition(10,0);
        //System.out.println(result);
    }
}
