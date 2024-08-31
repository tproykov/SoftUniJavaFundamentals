package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class M03GamingStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double totalSpent = 0;
        while (!command.equals("Game Time")) {

            double gamePrice = 0;
            switch (command) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    command = scanner.nextLine();
                    continue;
            }
            if (gamePrice <= currentBalance) {
                currentBalance -= gamePrice;
                totalSpent += gamePrice;
                System.out.println("Bought " + command);
            }
            else {
                System.out.println("Too Expensive");
            }
            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                return;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
    }
}

// Write a program that helps you buy the games. The valid games are the following games in this table:
//Name	                    Price
//OutFall 4	                $39.99
//CS: OG	                $15.99
//Zplinter Zell	            $19.99
//Honored 2	                $59.99
//RoverWatch	            $29.99
//RoverWatch Origins Edition	$39.99
//On the first line, you will receive your current balance – a floating-point number in the range
// [0.00…5000.00].
//Until you receive the command "Game Time", you have to keep buying games. When a game is bought,
// the user's balance decreases by the price of the game.
//Additionally, the program should obey the following conditions:
//•	If a game the user is trying to buy is not present in the table above, print "Not Found" and read
// the next line.
//•	If at any point, the user has $0 left, print "Out of money!" and end the program.
//•	Alternatively, if the user is trying to buy a game that they can't afford, print "Too Expensive" and
// read the next line.
//When you receive "Game Time", print the user's remaining money and total spent on games, rounded to
// the 2nd decimal place.
