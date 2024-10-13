package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10SoftUniCoursePlanning {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command;
        while (!"course start".equals(command = scanner.nextLine())) {

            String[] commandArgs = command.split(":");
            String commandType = commandArgs[0];
            String lessonTitle = commandArgs[1];
            switch (commandType) {
                case "Add" -> {
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(commandArgs[2]);
                    if (!schedule.contains(lessonTitle) && index >= 0 && index <= schedule.size()) {
                        schedule.add(index, lessonTitle);
                    }
                }
                case "Remove" -> {
                    String exercise = lessonTitle + "-Exercise";
                    schedule.remove(lessonTitle);
                    schedule.remove(exercise);
                }
                case "Swap" -> {
                    String lessonTitle1 = commandArgs[2];
                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle1)) {
                        int index1 = schedule.indexOf(lessonTitle);
                        int index2 = schedule.indexOf(lessonTitle1);
                        schedule.set(index1, lessonTitle1);
                        schedule.set(index2, lessonTitle);
                    }
                    String exercise1 = lessonTitle + "-Exercise";
                    String exercise2 = lessonTitle1 + "-Exercise";
                    if (schedule.contains(exercise1)) {
                        schedule.remove(exercise1);
                        int index1 = schedule.indexOf(lessonTitle);
                        schedule.add(index1 + 1, exercise1);
                    }
                    if (schedule.contains(exercise2)) {
                        schedule.remove(exercise2);
                        int index2 = schedule.indexOf(lessonTitle1);
                        schedule.add(index2 + 1, exercise2);
                    }
                }
                case "Exercise" -> {
                    String exercise = lessonTitle + "-Exercise";
                    if (schedule.contains(lessonTitle)) {
                        if (!schedule.contains(exercise)) {
                            int index = schedule.indexOf(lessonTitle);
                            schedule.add(index + 1, exercise);
                        }
                    }
                    else {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                }
            }
        }
        for (int i = 0; i < schedule.size(); i++) {
            System.out.print(i + 1);
            System.out.print(".");
            System.out.println(schedule.get(i));
        }
//        int counter = 1;
//        for (String course : schedule) {
//            System.out.println(counter + "." + course);
//            counter++;
//        }
    }
}

// You are tasked to help plan the next Programming Fundamentals course by keeping track of the
// lessons that will be included in the course, as well as all the exercises for the lessons.
//On the first input line, you will receive the initial schedule of lessons and exercises that will
// be part of the next course, separated by a comma and space ", ". But before the course starts,
// there are some changes to be made. Until you receive "course start", you will be given some
// commands to modify the course schedule. The possible commands are:
//•	Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
//•	Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
//•	Remove:{lessonTitle} - remove the lesson, if it exists
//•	Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
//•	Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if the lesson
// exists and there is no exercise already, in the following format: "{lessonTitle}-Exercise". If the
// lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
//Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any,
// which follow the lessons.
//Input
//•	On the first line -the initial schedule lessons -strings, separated by comma and space ", ".
//•	Until "course start", you will receive commands in the format described above.
//Output
//•	Print the whole course schedule, each lesson on a new line with its number(index) in the schedule:
//"{lesson index}.{lessonTitle}".
//•	Allowed working time / memory: 100ms / 16MB.
