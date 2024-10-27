package PF06ObjectsAndClasses.E02Articles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] articleParts = scanner.nextLine().split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String command = scanner.nextLine();

            String[] commandParts = command.split(": ");

            switch (commandParts[0]) {
                case "Edit" -> {
                    String newContent = commandParts[1];
                    article.edit(newContent);
                }
                case "ChangeAuthor" -> {
                    String newAuthor = commandParts[1];
                    article.changeAuthor(newAuthor);
                }
                case "Rename" -> {
                    String newTitle = commandParts[1];
                    article.rename(newTitle);
                }
            }
        }
        System.out.println(article);
    }
}