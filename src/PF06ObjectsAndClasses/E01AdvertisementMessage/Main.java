package PF06ObjectsAndClasses.E01AdvertisementMessage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        for (int i = 0; i < numberOfMessages; i++) {

            String randomMessage = message.randomMessage();
            System.out.println(randomMessage);
        }
    }
}