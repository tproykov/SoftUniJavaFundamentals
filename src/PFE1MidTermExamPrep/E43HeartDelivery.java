package PFE1MidTermExamPrep;

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

// You will receive a string with even integers, separated by a "@" - this is our neighborhood. After
// that, a series of Jump commands will follow until you receive "Love!". Every house in the
// neighborhood needs a certain number of hearts delivered by Cupid so it can celebrate Valentine's day.
// The integers in the neighborhood indicate those needed hearts.
//Cupid starts at the position of the first house (index 0) and must jump by a given length. The jump
// commands will be in this format: "Jump {length}".
//Every time he jumps from one house to another, the needed hearts for the visited house are decreased
// by 2:
//•	If the needed hearts for a certain house become equal to 0, print on the console "Place
// {house_index} has Valentine's day."
//•	If Cupid jumps to a house where the needed hearts are already 0, print on the console "Place
// {house_index} already had Valentine's day."
//•	Keep in mind that Cupid can have a larger jump length than the size of the neighborhood, and if
// he does jump outside of it, he should start from the first house again (index 0).
//For example, we are given this neighborhood: 6@6@6. Cupid is at the start and jumps with a length
// of 2. He will end up at index 2 and decrease the needed hearts by 2: [6, 6, 4]. Next, he jumps
// again with a length of 2 and goes outside the neighborhood, so he goes back to the first house
// (index 0) and again decreases the needed hearts there: [4, 6, 4].
//Input
//•	On the first line, you will receive a string with even integers separated by "@" – the
// neighborhood and the number of hearts for each house.
//•	On the next lines, until "Love!" is received, you will be getting jump commands in this format:
// "Jump {length}".
//Output
//In the end, print Cupid's last position and whether his mission was successful or not:
//•	"Cupid's last position was {last_position_index}."
//•	If each house has had Valentine's day, print:
//o	"Mission was successful."
//•	If not, print the count of all houses that didn't celebrate Valentine's Day:
//o	"Cupid has failed {houseCount} places."
//Constraints
//•	The neighborhood's size will be in the range [1…20].
//•	Each house will need an even number of hearts in the range [2 … 10].
//•	Each jump length will be an integer in the range [1 … 20].