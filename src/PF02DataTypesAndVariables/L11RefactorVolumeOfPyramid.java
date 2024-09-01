package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L11RefactorVolumeOfPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double volume = (width * length * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}

// You are given a working code that finds the volume of a pyramid. However, you should consider
// that the variables exceed their optimum span and have improper naming. Also, search for
// variables that have multiple purposes.
// Scanner scanner = new Scanner(System.in);
//double dul, sh, V = 0;
//System.out.print("Length: ");
//dul = Double.parseDouble(scanner.nextLine());
//System.out.print("Width: ");
//sh = Double.parseDouble(scanner.nextLine());
//System.out.print("Height: ");
//V = Double.parseDouble(scanner.nextLine());
//V = (dul * sh * V) / 3;
//System.out.printf("Pyramid Volume: %.2f", V);
//• Reduce the span of the variables by declaring them at the moment they receive a value, not before
//•	Rename your variables to represent their real purpose (example: "dul" should become length, etc.)
//•	Search for variables that have multiple purposes. If you find any, introduce a new variable.
