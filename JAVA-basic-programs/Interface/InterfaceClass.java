package Interface;

// Java 9 program to illustrate
// private methods in interfaces
// to call private methods we have to call them in default public methods
public interface InterfaceClass {

    void multiply(int a, int b);

     default void add(int a, int b) {
        //calling private methods
        sub(a, b);
        div(a, b);

        int c = a + b;
        System.out.println("Addition in default method: " + c);
    }

    private void sub(int a, int b) {
        int c = b - a;
        System.out.println("Subtraction in private method: " + c);
    }

    private static void div(int a, int b) {
        int c = b / a;
        System.out.println("Division in private static method: " + c);
    }
}

class Interface implements InterfaceClass {
        public void multiply(int a, int b) {
            int c = a * b;
            System.out.println("Multiplication in public method: " +c);
        }

    public static void main(String[] args) {
        Interface  obj = new Interface();
        obj.multiply(10,20);
        obj.add(10,20);
    }
}
