package PF08TextProcessing;

import java.util.Scanner;

public class E05MultiplyingBigNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier == 0) {
            System.out.println("0");
            return;
        }

        bigNumber = bigNumber.replaceAll("^0+", "");
        if (bigNumber.isEmpty()) {
            System.out.println("0");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int carryOverDigit = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(bigNumber.charAt(i));

            int product = multiplier * digit + carryOverDigit;

            int lastDigit = product % 10;
            stringBuilder.append(lastDigit);

            carryOverDigit = product / 10;
        }

        if (carryOverDigit > 0) {
            stringBuilder.append(carryOverDigit);
        }

        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}