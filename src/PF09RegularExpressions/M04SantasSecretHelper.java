package PF09RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M04SantasSecretHelper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behaviour>[GN])!";
        Pattern pattern = Pattern.compile(regex);

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                char character = command.charAt(i);
                char decryptedCharacter = (char) (character - key);
                decryptedMessage.append(decryptedCharacter);
            }
            Matcher matcher = pattern.matcher(decryptedMessage.toString());

            if (matcher.find()) {
                String behaviour = matcher.group("behaviour");
                if (behaviour.equals("G")) {
                    String name = matcher.group("name");
                    System.out.println(name);
                }
            }
            command = scanner.nextLine();
        }
    }
}