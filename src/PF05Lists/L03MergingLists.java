package PF05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03MergingLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        if (list1.size() >= list2.size()) {
            for (int i = 0; i < list2.size(); i++) {
                resultList.add(list1.get(i));
                resultList.add(list2.get(i));
            }
            for (int i = list2.size(); i < list1.size(); i++) {
                resultList.add(list1.get(i));
            }
        }
        else {
            for (int i = 0; i < list1.size(); i++) {
                resultList.add(list1.get(i));
                resultList.add(list2.get(i));
            }
            for (int i = list1.size(); i < list2.size(); i++) {
                resultList.add(list2.get(i));
            }
        }
        for (Integer integer : resultList) {
            System.out.print(integer + " ");
        }
    }
}

// You are going to receive two lists with numbers. Create a result list that
// contains the numbers from both of the lists. The first element should be
// from the first list, the second from the second list, and so on. If the
// length of the two lists is not equal, just add the remaining elements at
// the end of the list.
