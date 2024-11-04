package PF08TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class M03TreasureFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String command;
        while (!"end".equals(command = scanner.nextLine())) {

            int index = 0;
            String decryptedMessage = "";
            for (int i = 0; i < command.length(); i++) {

                char decryptedChar = (char) (command.charAt(i) + key[index]);

                decryptedMessage += decryptedChar;

                index++;
                if (index == key.length) {
                    index = 0;
                }
            }

            String[] treasureParts = decryptedMessage.split("&");
            String treasure = treasureParts[1];

            String[] coordinatesParts = treasure.split(",");



        }
    }
}