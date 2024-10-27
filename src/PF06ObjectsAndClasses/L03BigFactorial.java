package PF06ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class L03BigFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateFactorial(n));
    }

    private static BigInteger calculateFactorial(int n) {

        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        return factorial;
    }
}