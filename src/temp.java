import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Aria", "Charlie");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);  // Prints "Alice"
    }
}