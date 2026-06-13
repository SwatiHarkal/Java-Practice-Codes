package ExceptionHandling;

public class DivideByZero {
    void divide(int a, int b){
        try {
            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by Zero Exception: " +e);
        }
    }

    public static void main(String[] args) {
        DivideByZero obj = new DivideByZero();
        obj.divide(10,0);
    }
}
