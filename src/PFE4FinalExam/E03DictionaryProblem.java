package PFE4FinalExam;

import java.util.*;

public class E03DictionaryProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringOfWords = input.split(" \\| ");

        Map<String, List<String>> wordsDefinitions = new LinkedHashMap<>();

        for (String wordParts : stringOfWords) {

            String[] wordDefinition = wordParts.split(": ");

            String word = wordDefinition[0];
            String definition = wordDefinition[1];

            if (!wordsDefinitions.containsKey(word)) {
                List<String> definitions = new ArrayList<>();
                definitions.add(definition);
                wordsDefinitions.put(word, definitions);
            } else {
                wordsDefinitions.get(word).add(definition);
            }
        }

        String[] wordsToBeTested = scanner.nextLine().split(" \\| ");
        List<String> wordsToBeTestedList = Arrays.asList(wordsToBeTested);

        String command = scanner.nextLine();

        if (command.equals("Test")) {

            for (Map.Entry<String, List<String>> entry : wordsDefinitions.entrySet()) {

                String word = entry.getKey();
                List<String> definitions = entry.getValue();

                if (wordsToBeTestedList.contains(word)) {

                    System.out.println(word + ":");

                    for (String definition : definitions) {
                        System.out.println(" -" + definition);
                    }
                }
            }
        } else if (command.equals("Hand Over")) {
            for (String word : wordsDefinitions.keySet()) {
                System.out.print(word + " ");
            }
        }
    }
}