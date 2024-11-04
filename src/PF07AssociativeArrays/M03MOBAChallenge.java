package PF07AssociativeArrays;

import java.util.*;

public class M03MOBAChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // store the players' total skills
        Map<String, Integer> playerTotalSkills = new HashMap<>();
        // store the players' individual "position skill" combos: {Peter=[Adc 400], Sam=[Mid 200, Support 250]}
        Map<String, List<String>> playerPositions = new HashMap<>();
        while (!input.equals("Season end")) {

            if (input.contains(" -> ")) {
                // if the input is: "{player} -> {position} -> {skill}"
                String[] tokens = input.split(" -> ");
                String player = tokens[0];
                String position = tokens[1];
                int skill = Integer.parseInt(tokens[2]);

                // update the current player's total skills and "position skill" combos
                playerPositions.putIfAbsent(player, new ArrayList<>());

                // iterate the list of "position skill" combos of the current player from the playerTotalSkills map
                boolean updated = false;
                for (int index = 0; index < playerPositions.get(player).size(); index++) {
                    // each individual "position skill" combo from the list for the current player
                    String posSkill = playerPositions.get(player).get(index);
                    String[] ps = posSkill.split(" ");
                    // current position on the list in the map
                    String currentPosition = ps[0];
                    // current skill on the list in the map
                    int currentSkill = Integer.parseInt(ps[1]);
                    // check if the current skill in the list needs to be updated, if it is smaller than the new value
                    if (currentPosition.equals(position)) {
                        if (currentSkill < skill) {
                            // update the current "position skill" combo with the new value at the given index
                            playerPositions.get(player).set(index, position + " " + skill);
                            // update the total skills for the current player with the new value
                            playerTotalSkills.put(player, playerTotalSkills.get(player) - currentSkill + skill);
                        }
                        updated = true;
                        break;
                    }
                }
                // check if this is a new position for the player and if so, add a new "position skill" combo to the map
                if (!updated) {
                    playerPositions.get(player).add(position + " " + skill);
                    // update current player's total skills - add the new value to the sum
                    playerTotalSkills.put(player, playerTotalSkills.getOrDefault(player, 0) + skill);
                }

            } else if (input.contains(" vs ")) {
                // if the input is "{player} vs {player}" - duel
                String[] tokens = input.split(" vs ");
                String player1 = tokens[0];
                String player2 = tokens[1];

                // check if both players given in the input exist
                if (playerPositions.containsKey(player1) && playerPositions.containsKey(player2)) {

                    // check if both players have a common position
                    boolean commonPosition = false;
                    // nested for-each loops - iterate all positions of the first player and all positions
                    // of the second player
                    for (String posSkill1 : playerPositions.get(player1)) {
                        String position1 = posSkill1.split(" ")[0];
                        for (String posSkill2 : playerPositions.get(player2)) {
                            String position2 = posSkill2.split(" ")[0];
                            if (position1.equals(position2)) {
                                commonPosition = true;
                                break;
                            }
                        }
                        if (commonPosition) {
                            break;
                        }
                    }
                    // in case of established common position of the two players - duel!
                    if (commonPosition) {
                        int totalSkill1 = playerTotalSkills.get(player1);
                        int totalSkill2 = playerTotalSkills.get(player2);

                        // demote the defeated player from the tire - remove them from both maps
                        if (totalSkill1 > totalSkill2) {
                            playerTotalSkills.remove(player2);
                            playerPositions.remove(player2);
                        } else if (totalSkill2 > totalSkill1) {
                            playerTotalSkills.remove(player1);
                            playerPositions.remove(player1);
                        }
                    }
                }
            }
            input = scanner.nextLine();

        }
        // output - print the results
        // "{player}: {totalSkill} skill
        // - {position} <::> {skill}"
        // print the players, ordered by total skill in descending order, if two players or more have the same total
        // skill, then order them by the players' names in ascending order
        // for each player print their position and skill ordered descending by skill and if two or more positions have
        // the same skill, then order them by position name in ascending order

        // print first the player and their total skills: {player}: {totalSkill} skill
        // iterate for each player (entry set) from the playerTotalSkills map and sort them by total skills:
        playerTotalSkills.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    // cmp = compare?
                    int cmp = e2.getValue().compareTo(e1.getValue());
                    if (cmp == 0) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                    return cmp;
                })
                .forEach(entry -> {
                    String player = entry.getKey();
                    int totalSkill = entry.getValue();
                    System.out.println(player + ": " + totalSkill + " skill");

                    // take for this particular player their "position skill" combo from the playerPositions map
                    // and sort them as instructed above
                    playerPositions.get(player).stream()
                            .map(posSkill -> posSkill.split(" "))
                            .sorted((ps1, ps2) -> {
                                int skill1 = Integer.parseInt(ps1[1]);
                                int skill2 = Integer.parseInt(ps2[1]);
                                int cmp = Integer.compare(skill2, skill1);
                                if (cmp == 0) {
                                    return ps1[0].compareTo(ps2[0]);
                                }
                                return cmp;
                            })
                            // print the "position skill" combo as "position <::> skill" sorted as instructed above
                            .forEach(ps -> {
                                String position = ps[0];
                                String skill = ps[1];
                                System.out.println("- " + position + " <::> " + skill);
                            });
                });


    }
}
