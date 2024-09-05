package PF04Methods;

import java.util.Scanner;

public class M03LongerLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        System.out.println(getLongerLine(x1, y1, x2, y2, x3, y3, x4, y4));
    }
    private static String getLongerLine(int x1, int y1, int x2, int y2,
                                        int x3, int y3, int x4, int y4) {

        double lengthFirstLine = Math.sqrt(Math.pow((x1 - x2), 2)
                + Math.pow((y1 - y2), 2));
        double lengthSecondLine = Math.sqrt(Math.pow((x3 - x4), 2)
                + Math.pow((y3 - y4), 2));
        boolean firstIsLonger = lengthFirstLine >= lengthSecondLine;

        if (firstIsLonger) {
            return arrangeByCloseness(x1, y1, x2, y2);
        }
        else {
            return arrangeByCloseness(x3, y3, x4, y4);
        }
    }
    private static String arrangeByCloseness(int x1, int y1, int x2, int y2) {

        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        boolean isFirst = distance1 <= distance2;
        if (isFirst) {
            return String.format("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        }
        else {
            return String.format("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }
    }
}

// You are given the coordinates of four points in the 2D plane.
// The first and the second pair of points form two different lines.
// Print the longer line in the format "(X1, Y1)(X2, Y2)" starting with
// the point that is closer to the center of the coordinate system (0, 0)
// (You can reuse the method that you wrote for the previous problem).
// If the lines are of equal length, print only the first one.