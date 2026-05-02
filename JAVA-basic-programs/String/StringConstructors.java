package String;

//String()
//String(String str)
//String(char chars[ ])
//String(char chars[ ], int startIndex, int count)
//String(byte byteArr[ ])
//String(byte byteArr[ ], int startIndex, int count)

public class StringConstructors {
    public static void main(String[] args) {
        //1. To create an empty string, we will call the default constructor.
        String s = new String();
        System.out.println(s);

        //2. String(String str): This is the most common string constructor
        // that we generally use in the Java program. This constructor will
        // create a new string object in the heap area and stores the given value in it.
        String s2 = new String("Hello Java");
        System.out.println(s2);

        //3. String(char chars[ ]): This string constructor creates
        // a string object and stores the array of characters in it
        char chars[] = { 'a', 'b', 'c', 'd' };
        String s3 = new String(chars);
        System.out.println(s3);

        //4. String(char chars[ ], int startIndex, int count): This constructor
        // creates and initializes a string object with a subrange
        // of a character array
        char chars1[] = { 'w', 'i', 'n', 'd', 'o', 'w', 's'  };
        String str = new String(chars1, 2, 3);
        System.out.println(str);
        System.out.println("character at "+str.charAt(2));


        //5. String(byte byteArr[ ]): This type of string constructor constructs
        // a new string object by decoding the given array of bytes
        // (i.e., by decoding ASCII values into the characters)
        // according to the system’s default character set.
        byte b[] = { 97, 98, 99, 100 };
        String s4 = new String(b);
        System.out.println(s4); //o/p: abcd


        //6. String(byte byteArr[ ], int startIndex, int count):
        // This constructor also creates a new string object by decoding the
        // ASCII values using the system’s default character set.
            byte barr[] = { 65, 66, 67, 68, 69, 70 }; // Range of bytes: -128 to 127.
            String s5 = new String(barr, 2, 4); // CDEF
            System.out.println(s5); //o/p: CDEF
    }
}
