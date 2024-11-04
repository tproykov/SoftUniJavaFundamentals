package PF07AssociativeArrays;

import java.util.*;

public class L01CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] realNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> realNumbersCount = new TreeMap<>();

        for (double realNumber : realNumbers) {
            if (!realNumbersCount.containsKey(realNumber)) {
                realNumbersCount.put(realNumber, 1);
            }
            else {
                realNumbersCount.put(realNumber, realNumbersCount.get(realNumber) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : realNumbersCount.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}