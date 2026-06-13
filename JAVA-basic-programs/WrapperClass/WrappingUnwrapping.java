package WrapperClass;

public class WrappingUnwrapping {
    public static void main(String[] args)
    {
        char ch = 'a'; // char data type.
        Character chrobj = ch; // AutoWrapping char type value into Character object.

        byte a = 10; // byte data type value.
        Byte byteobj = a; // AutoWrapping byte type value into Byte object.

        int b = 20; // int type value.
        Integer intobj = b; // AutoWrapping int type value into Integer object.

        float c = 18.6f; // float type value.
        Float floatobj = c; // AutoWrapping float type value into Float object.

        double d = 250.5; // double data type value.
        Double doubleobj = d; // AutoWrapping double data type value into Double object.

// Displaying the values from wrapper class objects.
        System.out.println("Displaying values of Wrapper class objects:");
        System.out.println("Character object:  " + chrobj);
        System.out.println("Byte object:  " + byteobj);
        System.out.println("Integer object:  " + intobj);

        System.out.println("Float object:  " + floatobj);
        System.out.println("Double object:  " + doubleobj);

        System.out.println("\n");
// Retrieving primitive data type values from objects.
// UnWrapping objects to primitive data type values.
        char chr = chrobj;
        byte by = byteobj;
        int in = intobj;
        float fl = floatobj;
        double db = doubleobj;

// Displaying the values of data types.
        System.out.println("Displaying unwrapped values: ");

        System.out.println("char value: " + chr);
        System.out.println("byte value: " + by);

        System.out.println("int value: " + in);
        System.out.println("float value: " + fl);
        System.out.println("double value: " + db);
    }
}
