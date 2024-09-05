package PF04Methods;

import java.util.Scanner;

public class M02CenterPoint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        System.out.println(printCloseToCenter(x1, y1, x2, y2));
    }
    private static String printCloseToCenter(int x1, int y1, int x2, int y2) {

        double closest = Double.MAX_VALUE;
        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        boolean isFirst = false;
        if (distance1 <= distance2) {
            isFirst = true;
        }
        if (isFirst) {
            return String.format("(%d, %d)", x1, y1);
        }
        else {
            return String.format("(%d, %d)", x2, y2);
        }
    }
}

// You are given the coordinates of two points on a Cartesian coordinate
// system - X1, Y1, X2, and Y2. Create a method that prints the point that
// is closest to the center of the coordinate system (0, 0)
// in the format (X, Y). If the points are at the same distance from the
// center, print only the first one.
