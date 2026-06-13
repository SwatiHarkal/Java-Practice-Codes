package Java8;

import java.util.Arrays;
import java.util.List;

public class TryCatchInsideLambda {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1","a","2","3");

        numbers.forEach(num -> {
            try{
                int parsedNum = Integer.parseInt(num);
                System.out.println("Parsed Number: " + parsedNum);
            } catch (NumberFormatException e){
                System.out.println("Sorry invalid number: " + e.getMessage());
            }
        });
    }
}
