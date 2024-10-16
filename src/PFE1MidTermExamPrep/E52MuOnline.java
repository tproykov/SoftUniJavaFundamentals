package PFE1MidTermExamPrep;

import java.util.Scanner;

public class E52MuOnline {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dungeon = scanner.nextLine().split("\\|");

        int health = 100;
        int totalBitcoins = 0;
        for (int i = 0; i < dungeon.length; i++) {

            String[] tokens = dungeon[i].split(" ");
            String command = tokens[0];
            switch (command) {
                case "potion" -> {
                    int life = Integer.parseInt(tokens[1]);
                    health += life;
                    if (health > 100) {
                        System.out.println("You healed for " + (life - (health - 100)) + " hp.");
                        health = 100;
                    }
                    else {
                        System.out.println("You healed for " + life + " hp.");
                    }
                    System.out.println("Current health: " + health + " hp.");
                }
                case "chest" -> {
                    int bitcoins = Integer.parseInt(tokens[1]);
                    System.out.println("You found " + bitcoins + " bitcoins.");
                    totalBitcoins += bitcoins;
                }
                default -> {
                    String monster = tokens[0];
                    int attack = Integer.parseInt(tokens[1]);
                    health -= attack;
                    if (health > 0) {
                        System.out.println("You slayed " + monster + ".");
                    }
                    else {
                        System.out.println("You died! Killed by " + monster + ".");
                        System.out.println("Best room: " + (i + 1));
                        return;
                    }
                }
            }
        }
        System.out.println("You've made it! ");
        System.out.println("Bitcoins: " + totalBitcoins);
        System.out.println("Health: " + health);
    }
}

// You have initial health 100 and initial bitcoins 0. You will be given a string representing the
// dungeon's rooms. Each room is separated with '|' (vertical bar): "room1|room2|room3…"
//Each room contains a command and a number, separated by space. The command can be:
//•	"potion"
//o	You are healed with the number in the second part. But your health cannot exceed your initial
// health (100).
//o	First print: "You healed for {amount} hp."
//o	After that, print your current health: "Current health: {health} hp."
//•	"chest"
//o	You've found some bitcoins, the number in the second part.
//o	Print: "You found {amount} bitcoins."
//•	In any other case, you are facing a monster, which you will fight. The second part of the room
// contains the attack of the monster. You should remove the monster's attack from your health.
//o	If you are not dead (health <= 0), you've slain the monster, and you should print: "You slayed
// {monster}."
//o	If you've died, print "You died! Killed by {monster}." and your quest is over. Print the best
// room you've managed to reach: "Best room: {room}"
//If you managed to go through all the rooms in the dungeon, print on the following three lines:
//"You've made it!
//Bitcoins: {bitcoins}
//Health: {health}"
//Input / Constraints
//You receive a string representing the dungeon's rooms, separated with '|' (vertical bar):
// "room1|room2|room3…".
//Output
//Print the corresponding messages described above.
