package WrapperClass;

import static java.lang.Byte.MIN_VALUE;

public class Test {
    public static void main(String[] args)
    {
// Integer range constants:
        System.out.println("Range of Byte: "+ MIN_VALUE+ " to "+ Byte.MAX_VALUE);
        System.out.println("Range of Short: " +Short.MIN_VALUE+ " to" + Short.MAX_VALUE);

        System.out.println("Range of Integer: " +Integer.MIN_VALUE+ " to" + Integer.MAX_VALUE);
        System.out.println("Range of Long: " +Long.MIN_VALUE+ " to" + Long.MAX_VALUE);

// Floating-point range constants.
        System.out.println("Range of Float: " +Float.MIN_VALUE+ " to" + Float.MAX_VALUE );
        System.out.println("Range of Double: " +Double.MIN_VALUE+ " to" + Double.MAX_VALUE );

// Other useful constants.
        System.out.println("Math.PI: " +Math.PI);
        System.out.println("Math.E: " +Math.E);
    }
}
