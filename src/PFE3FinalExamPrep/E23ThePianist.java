package PFE3FinalExamPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E23ThePianist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] pieceParts = scanner.nextLine().split("\\|");
            String pieceName = pieceParts[0];
            String pieceComposerName = pieceParts[1];
            String pieceKeyName = pieceParts[2];
            pieceComposer.put(pieceName, pieceComposerName);
            pieceKey.put(pieceName, pieceKeyName);
        }

        String command;
        while (!(command = scanner.nextLine()).equals("Stop")) {

            String[] commandParts = command.split("\\|");
            String commandType = commandParts[0];
            String piece = commandParts[1];

            switch (commandType) {
                case "Add" -> {
                    String composer = commandParts[2];
                    String key = commandParts[3];
                    if (pieceComposer.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");
                    }
                    else {
                        pieceComposer.put(piece, composer);
                        pieceKey.put(piece, key);
                        System.out.println(piece + " by " + composer + " in " + key + " added to the collection!");
                    }
                }
                case "Remove" -> {
                    if (!pieceComposer.containsKey(piece)) {
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    }
                    else {
                        pieceComposer.remove(piece);
                        pieceKey.remove(piece);
                        System.out.println("Successfully removed " + piece + "!");
                    }
                }
                case "ChangeKey" -> {
                    String newKey = commandParts[2];
                    if (!pieceComposer.containsKey(piece)) {
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    }
                    else {
                        pieceKey.put(piece, newKey);
                        System.out.println("Changed the key of " + piece + " to " + newKey + "!");
                    }
                }
            }
        }
        for (String piece : pieceComposer.keySet()) {

            String composer = pieceComposer.get(piece);
            String key = pieceKey.get(piece);

            System.out.println(piece + " -> Composer: " + composer + ", Key: " + key);
        }
    }
}