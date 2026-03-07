package String;/*
 * String Class Methods Program in Java
 */

public class MethodsOfStringClass
{
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "from";
        String str3 = "JAVA";
        int len = str1.length();
        System.out.println("The length of the String str1 using length() is "+len);
        String str4 = str1.concat(str2).concat(str3);
        System.out.println("The string after concatenation using concat() is " +str4);
        char c = str4.charAt(5);
        System.out.println("The character atindex 5 using charAt() is  " +c);
        String str5 = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        String str6[]= str5.split("M");
        String part1 = str6[0];
        String part2 = str6[1];
        System.out.println("The string after spliting using split() will be = "+part1+" "+part2);
        String str7 = "hello";
        boolean equals = str7.equals(str1);
        System.out.println("The String7 is equals to string1? "+equals);
        boolean equalsIgnore = str7.equalsIgnoreCase(str1);
        System.out.println("The String7 is equals to string1? "+equalsIgnore);

        System.out.println("Uppercase for str2 "+str2.toUpperCase());
        System.out.println("Lowercase for str3 "+str3.toLowerCase());

        String str8 = str3.substring(1,3);
        System.out.println("String8 "+str8);

    }
}
