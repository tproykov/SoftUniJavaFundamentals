package PF09RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01Furniture {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> furnitureList = new ArrayList<>();
        double totalCost = 0;

        String regex = ">>(?<furniturePiece>[A-Z]+[a-z]*)<<(?<price>\\d+[.]*\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        String input;
        while (!(input = scanner.nextLine()).equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {

                String furniturePiece = matcher.group("furniturePiece");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                double pricePerFurniture = price * quantity;

                furnitureList.add(matcher.group("furniturePiece"));
                totalCost += pricePerFurniture;
            }
        }
        System.out.println("Bought furniture:");
        for (String furniturePiece : furnitureList) {
            System.out.println(furniturePiece);
        }
        System.out.printf("Total money spend: %.2f", totalCost);
    }
}