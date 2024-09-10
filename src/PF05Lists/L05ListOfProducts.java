package PF05Lists;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class L05ListOfProducts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            list.add(product);
        }

        Collections.sort(list);

        for (int i = 1; i <= list.size(); i++) {
            System.out.println(i + "." + list.get(i - 1));
        }
    }
}

// Read a number n and n lines of products. Print a numbered list of all
// the products ordered by name.
