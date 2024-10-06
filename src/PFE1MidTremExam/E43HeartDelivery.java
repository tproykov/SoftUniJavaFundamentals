package PFE1MidTremExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E43HeartDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> neighbourhood = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command;
        int jumpIndex = 0;
        while (!"Love!".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");
            int jump = Integer.parseInt(tokens[1]);

            jumpIndex += jump;
            if (jumpIndex >= neighbourhood.size()) {
                jumpIndex = 0;
            }
            int heartsNeeded = neighbourhood.get(jumpIndex);
            if (heartsNeeded <= 0) {
                System.out.println("Place " + jumpIndex + " already had Valentine's day.");
            }
            else {
                heartsNeeded -= 2;
                neighbourhood.set(jumpIndex, heartsNeeded);
                if (heartsNeeded <= 0) {
                    System.out.println("Place " + jumpIndex + " has Valentine's day.");
                }
            }
        }
        System.out.println("Cupid's last position was " + jumpIndex + ".");
        boolean missionSuccessful = true;
        int failedHouses = 0;
        for (Integer house : neighbourhood) {
            if (house > 0) {
                missionSuccessful = false;
                failedHouses++;
            }
        }
        if (missionSuccessful) {
            System.out.println("Mission was successful.");
        }
        else {
            System.out.println("Cupid has failed " + failedHouses + " places.");
        }
    }
}