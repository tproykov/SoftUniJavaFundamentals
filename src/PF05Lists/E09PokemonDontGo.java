package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E09PokemonDontGo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (!distances.isEmpty()) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int removed = distances.getFirst();
                sum += removed;
                int copied = distances.getLast();
                distances.set(0, copied);
                modifyDistances(distances, removed);
            }
            else if (index > distances.size() - 1) {
                int removed = distances.getLast();
                sum += removed;
                int copied = distances.getFirst();
                distances.set(distances.size() - 1, copied);
                modifyDistances(distances, removed);
            }
            else {
                int removed = distances.get(index);
                sum += removed;
                distances.remove(index);
                modifyDistances(distances, removed);
            }
        }
        System.out.println(sum);
    }
    private static void modifyDistances(List<Integer> distances, int removed) {
        for (int i = 0; i < distances.size(); i++) {
            int distance = distances.get(i);
            if (distance <= removed) {
                distance += removed;
                distances.set(i, distance);
            }
            else {
                distance -= removed;
                distances.set(i, distance);
            }
        }
    }
}

// Ely likes to play Pokémon Go a lot. But Pokémon Go went bankrupt… So, the developers made Pokémon
// Don't Go out of depression. And so, Ely now plays Pokémon Don't Go. In Pokémon Don't Go, when you
// walk to a certain Pokémon, those closest to you naturally get further, and those further from you
// get closer.
//You will receive a sequence of integers, separated by spaces - the distances to the Pokémons.
//Then you will begin receiving integers corresponding to indexes in that sequence.
//When you receive an index, you must remove the element at that index from the sequence (as if you've
// captured the Pokémon).
//•	You must INCREASE the value of all elements in the sequence which are LESS or EQUAL to the removed
// element with the value of the removed element.
//•	You must DECREASE the value of all elements in the sequence which are GREATER than the removed
// element with the value of the removed element.
//If the given index is LESS than 0, remove the first element of the sequence, and COPY the last
// element to its place.
//If the given index is GREATER than the last index of the sequence, remove the last element from the
// sequence, and COPY the first element to its place.
//The increasing and decreasing of elements should be done in these cases, also. The element whose
// value you should use is the REMOVED element.
//The program ends when the sequence has no elements (there are no Pokémons left for Ely to catch).
//Input
//•	On the first line of input, you will receive a sequence of integers, separated by spaces.
//•	On the next several lines, you will receive integers – the indexes.
//Output
//•	When the program ends, you must print the summed up value of all REMOVED elements on the console.
//Constraints
//•	The input data will consist ONLY of valid integers in the range [-2.147.483.648, 2.147.483.647].