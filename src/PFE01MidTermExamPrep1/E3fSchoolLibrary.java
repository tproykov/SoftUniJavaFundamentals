package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E3fSchoolLibrary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String command;

        while (!(command = scanner.nextLine()).equals("Done")) {

            String[] commandArgs = command.split(" \\| ");

            switch (commandArgs[0]) {
                case "Add Book" -> {
                    String bookName = commandArgs[1];
                    if (!books.contains(bookName)) {
                        books.addFirst(bookName);
                    }
                }
                case "Take Book" -> {
                    String bookName = commandArgs[1];
                    books.remove(bookName);
                }
                case "Swap Books" -> {
                    String book1 = commandArgs[1];
                    String book2 = commandArgs[2];
                    if (books.contains(book1) && books.contains(book2)) {
                        String temp = book1;
                        int index1 = books.indexOf(book1);
                        int index2 = books.indexOf(book2);
                        books.set(index1, book2);
                        books.set(index2, temp);
                    }
                }
                case "Insert Book" -> {
                    String bookName = commandArgs[1];
                    if (!books.contains(bookName)) {
                        books.add(bookName);
                    }
                }
                case "Check Book" -> {
                    int index = Integer.parseInt(commandArgs[1]);
                    if (index >= 0 && index < books.size()) {
                        System.out.println(books.get(index));
                    }
                }
            }
        }
        System.out.println(String.join(", ", books));
    }
}