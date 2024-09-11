import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = 2;
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        System.out.println(sum);
        if (sum == n) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    private static int factorial(int n) {
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}