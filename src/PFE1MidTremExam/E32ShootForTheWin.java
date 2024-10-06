package PFE1MidTremExam;

import java.util.Arrays;
import java.util.Scanner;

public class E32ShootForTheWin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command;
        int shotTargets = 0;
        while(!"End".equals(command = scanner.nextLine())) {

            int index = Integer.parseInt(command);

            if (index < 0 || index >= targets.length) {
                continue;
            }

            if (targets[index] != -1) {
                int shotTargetValue = targets[index];
                shotTargets++;
                targets[index] = -1;

                for (int i = 0; i < targets.length; i++) {

                    if (targets[i] > shotTargetValue && targets[i] != -1) {
                        targets[i] -= shotTargetValue;
                    }
                    else if (targets[i] <= shotTargetValue && targets[i] != -1) {
                        targets[i] += shotTargetValue;
                    }
                }
            }
        }
        System.out.print("Shot targets: " + shotTargets + " -> ");
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}