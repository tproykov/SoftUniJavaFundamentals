package PFE1MidTermExamPrep;

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

// Write a program that helps you keep track of your shot targets. You will receive a sequence with
// integers, separated by a single space, representing targets and their value. Afterward, you will be
// receiving indices until the "End" command is given, and you need to print the targets and the count
// of shot targets.
//Every time you receive an index, you need to shoot the target on that index, if it is possible.
//Every time you shoot a target, its value becomes -1, and it is considered a shot. Along with that,
// you also need to:
//•	Reduce all the other targets, which have greater values than your current target, with its value.
//•	Increase all the other targets, which have less than or equal value to the shot target, with its
// value.
//Keep in mind that you can't shoot a target, which is already shot. You also can't increase or reduce
// a target, which is considered a shot.
//When you receive the "End" command, print the targets in their current state and the count of shot
// targets in the following format:
//"Shot targets: {count} -> {target1} {target2}… {targetn}"
//Input / Constraints
//•	On the first line of input, you will receive a sequence of integers, separated by a single space –
// the targets sequence.
//•	On the following lines, until the "End" command, you be receiving integers each on a single line –
// the index of the target to be shot.
//Output
//•	The format of the output is described above in the problem description.