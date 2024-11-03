package PF08TextProcessing;

import java.util.Scanner;

public class E03ExtractFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] urlParts = scanner.nextLine().split("\\\\");

        String file = urlParts[urlParts.length - 1];

        String[] fileParts = file.split("\\.");

        String fileName = fileParts[0];
        String fileExtension = fileParts[fileParts.length - 1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}