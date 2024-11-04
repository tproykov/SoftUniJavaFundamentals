package PF06ObjectsAndClasses.E06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {

            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name, id, age);
            people.add(person);
        }

        people.sort(Comparator.comparingInt(Person::getAge));

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}