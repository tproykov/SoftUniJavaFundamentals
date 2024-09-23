package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E03Elevator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = 0;
        if (n % capacity == 0) {
            courses = n / capacity;
        }
        else {
            courses = n / capacity + 1;
        }
        System.out.println(courses);
    }
}

// Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of
// p persons.
//The input holds two lines: the number of people n and the capacity p of the elevator.