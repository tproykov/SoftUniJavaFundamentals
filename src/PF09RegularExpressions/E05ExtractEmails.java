package PF09RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05ExtractEmails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "[A-Za-z0-9]+[.\\-_]*[A-Za-z0-9]*@[a-z]+[\\-]*[a-z]*.[a-z]+(\\.[a-z]+)*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            System.out.println(matcher.group());
        }
    }
}