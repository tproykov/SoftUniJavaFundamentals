package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E11Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberSnowballs = Integer.parseInt(scanner.nextLine());

        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;
        long maxSnowballValue = 0;
        for (int i = 0; i < numberSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            long snowballValue = (long) Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
                maxSnowballSnow = snowballSnow;
            }
        }
        System.out.printf("%d : %d = %d (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue,
                maxSnowballQuality);
    }
}