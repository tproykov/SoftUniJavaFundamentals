import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        long num1 = 1;
        long num2 = 1;

        long fibonacci = 0;
        for (int i = 0; i < n; i++) {
            // Print the number
            // System.out.print(num1 + " ");
            // Swap
            fibonacci = num1;
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(fibonacci);
    }
}
