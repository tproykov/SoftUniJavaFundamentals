package PF05Lists;

import java.util.*;
import java.util.stream.Collectors;

public class M04MixedUpLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collections.reverse(list2);

        int constraint1 = 0;
        int constraint2 = 0;
        if (list1.size() > list2.size()) {
            constraint1 = list1.getLast();
            constraint2 = list1.get(list1.size() - 2);
            list1.removeLast();
            list1.removeLast();
        }
        else {
            constraint1 = list2.getLast();
            constraint2 = list2.get(list2.size() - 2);
            list2.removeLast();
            list2.removeLast();
        }
        int constraintMin = Math.min(constraint1, constraint2);
        int constraintMax = Math.max(constraint1, constraint2);

        List<Integer> combinedList = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));
        }

        Collections.sort(combinedList);

        for (Integer integer : combinedList) {
            if (integer > constraintMin
                    && integer < constraintMax) {
                System.out.print(integer + " ");
            }
        }
    }
}

// Write a program that mixes up two lists by some rules. You will receive two
// lines of input, each one being a list of numbers. The mixing rules are:
//•	Start from the beginning of the first list and the ending of the second.
//•	Add element from the first and element from the second.
//•	In the end, there will always be a list in which there are 2 elements
// remaining.
//•	These elements will be the range of the elements you need to print.
//•	Loop through the result list and take only the elements that fulfill the
// condition.
//•	Print the elements ordered in ascending order and separated by a space.