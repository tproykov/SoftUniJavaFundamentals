package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L06ForeignLanguages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}

// Write a program that:
//•	Reads a string from the console, representing country
//•	Print:
//o	"English" -> if the entered country is "USA" or "England"
//o	"Spanish" -> if the entered country is "Spain" or "Argentina" or "Mexico"
//o	"unknown" -> if the entered country is any other different from countries listed above
