package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E3cGreenhouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> crops = Arrays.stream(scanner.nextLine().split(" & ")).collect(Collectors.toList());

        String command;
        while (!"Collect!".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Plant" -> {
                    String crop = tokens[1];
                    if (!crops.contains(crop)) {
                        crops.addFirst(crop);
                    }
                }
                case "Transplant" -> {
                    String crop = tokens[1];
                    if (crops.contains(crop)) {
                        crops.remove(crop);
                        crops.add(crop);
                    }
                }
                case "Replace" -> {
                    int cropIndex1 = Integer.parseInt(tokens[1]);
                    int cropIndex2 = Integer.parseInt(tokens[2]);
                    if (cropIndex1 >= 0 && cropIndex2 >= 0 && cropIndex1 < crops.size()
                            && cropIndex2 < crops.size()) {
                        String temp = crops.get(cropIndex1);
                        crops.set(cropIndex1, crops.get(cropIndex2));
                        crops.set(cropIndex2, temp);
                    }
                }
                case "Uproot" -> {
                    String crop = tokens[1];
                    crops.remove(crop);
                }
            }
        }
        System.out.println(String.join(" | ", crops));
    }
}