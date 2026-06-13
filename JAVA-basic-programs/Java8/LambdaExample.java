package Java8;
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "", "Charlie");

        // Throwing an Unchecked Exception directly
        names.forEach(name -> {
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty!");
            }
            System.out.println(name);
        });
    }
}
