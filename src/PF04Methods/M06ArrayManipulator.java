package PF04Methods;

import java.util.Arrays;
import java.util.Scanner;

public class M06ArrayManipulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");

            String commandType = commandParts[0];

            String evenOrOdd;
            int countFirst;
            switch (commandType) {
                case "exchange":
                    int index = Integer.parseInt(commandParts[1]);
                    array = exchange(array, index);
                    break;
                case "max":
                    evenOrOdd = commandParts[1];
                    if (evenOrOdd.equals("odd")) {
                        maxOdd(array);
                    } else if (evenOrOdd.equals("even")) {
                        maxEven(array);
                    }
                    break;
                case "min":
                    evenOrOdd = commandParts[1];
                    if (evenOrOdd.equals("odd")) {
                        minOdd(array);
                    } else if (evenOrOdd.equals("even")) {
                        minEven(array);
                    }
                    break;
                case "first":
                    countFirst = Integer.parseInt(commandParts[1]);
                    evenOrOdd = commandParts[2];
                    if (evenOrOdd.equals("odd")) {
                        firstOdd(array, countFirst);
                    } else if (evenOrOdd.equals("even")) {
                        firstEven(array, countFirst);
                    }
                    break;
                case "last":
                    int count;
                    int counter;

                    count = Integer.parseInt(commandParts[1]);
                    if (count > array.length) {
                        System.out.println("Invalid count");
                        continue;
                    }
                    evenOrOdd = commandParts[2];
                    int[] last = new int[count];
                    counter = 0;
                    while (counter < count - 1) {
                        for (int i = array.length - 1; i >= 0; i++) {
                            if (counter < count - 1) {
                                if (evenOrOdd.equals("even")) {
                                    if (array[i] % 2 == 0) {
                                        last[counter] = array[i];
                                        count++;
                                    }
                                } else if (evenOrOdd.equals("odd")) {
                                    if (array[i] % 2 != 0) {
                                        last[counter] = array[i];
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                    if (counter < count - 1) {
                        System.out.println("[]");
                    } else {
                        for (int left = 0, right = last.length - 1;
                             left < right; left++, right--) {
                            int temp = last[left];
                            last[left] = last[right];
                            last[right] = temp;
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] exchange(int[] array, int index) {
        int[] exchangedArray = new int[array.length];
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index");
            return array;
        } else {
            int exchangeIndex = 0;
            for (int i = index + 1; i < array.length; i++) {
                exchangedArray[exchangeIndex] = array[i];
                exchangeIndex++;
            }
            for (int i = 0; i <= index; i++) {
                exchangedArray[exchangeIndex] = array[i];
                exchangeIndex++;
            }
        }
        return exchangedArray;
    }

    private static void maxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        boolean noMatches = true;
        for (int number : array) {
            if (number % 2 != 0) {
                noMatches = false;
                max = Math.max(max, number);
            }
        }
        if (noMatches) {
            System.out.println("No matches");
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == max) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    private static void maxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        boolean noMatches = true;
        for (int number : array) {
            if (number % 2 == 0) {
                noMatches = false;
                max = Math.max(max, number);
            }
        }
        if (noMatches) {
            System.out.println("No matches");
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == max) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    private static void minOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        boolean noMatches = true;
        for (int number : array) {
            if (number % 2 != 0) {
                noMatches = false;
                min = Math.min(min, number);
            }
        }
        if (noMatches) {
            System.out.println("No matches");
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == min) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    private static void minEven(int[] array) {
        int min = Integer.MAX_VALUE;
        boolean noMatches = true;
        for (int number : array) {
            if (number % 2 == 0) {
                noMatches = false;
                min = Math.min(min, number);
            }
        }
        if (noMatches) {
            System.out.println("No matches");
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == min) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    private static void firstOdd(int[] array, int countFirst) {
        int[] resultArray = new int[countFirst];
        int resultIndex = 0;
        for (int i = 0; i < array.length && resultIndex < countFirst; i++) {
            if (array[i] % 2 != 0) {
                resultArray[resultIndex] = array[i];
                resultIndex++;
            }
        }
        int[] finalResultArray = new int[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            finalResultArray[i] = resultArray[i];
        }
        System.out.println(Arrays.toString(finalResultArray));
    }

    private static void firstEven(int[] array, int countFirst) {
        int[] resultArray = new int[countFirst];
        int resultIndex = 0;
        for (int i = 0; i < array.length && resultIndex < countFirst; i++) {
            if (array[i] % 2 == 0) {
                resultArray[resultIndex] = array[i];
                resultIndex++;
            }
        }
        int[] finalResultArray = new int[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            finalResultArray[i] = resultArray[i];
        }
        System.out.println(Arrays.toString(finalResultArray));
    }
}


// Trifon has finally become a junior developer and has received his first task.
// It's about manipulating an array of integers. He is not quite happy about
// it, since he hates manipulating arrays. They will pay him a lot of money,
// though, and he is willing to give somebody half of it if to help him do his
// job. You, on the other hand, love arrays (and money) so you decide to try
// your luck.
//The array may be manipulated by one of the following commands:
//•	exchange {index} – splits the array after the given index and exchanges
// the places of the two resulting sub-arrays. E.g. [1, 2, 3, 4, 5] -> exchange
// 2 -> result: [4, 5, 1, 2, 3]
//o	If the index is outside the boundaries of the array, print "Invalid index".
//•	max even/odd – returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
//•	min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
//o	If there are two or more equal min/max elements, return the index of the
// rightmost one.
//o	If a min/max even/odd element cannot be found, print "No matches".
//•	first {count} even/odd – returns the first {count} elements -> [1, 8, 2, 3]
// -> first 2 even -> print [8, 2]
//•	last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3]
// -> last 2 odd -> print [1, 3]
//o	If the count is greater than the array length, print "Invalid count".
//o	If there are not enough elements to satisfy the count, print as many as
// you can. If there are zero even/odd elements, print an empty array "[]".
//•	end – stop taking input and print the final state of the array.
//Input
//•	The input data should be read from the console.
//•	On the first line, the initial array is received as a line of integers,
// separated by a single space.
//•	On the next lines, until the command "end" is received, you will receive
// the array manipulation commands.
//•	The input data will always be valid and in the format described. There is
// no need to check it explicitly.
//Output
//•	The output should be printed on the console.
//•	On a separate line, print the output of the corresponding command.
//•	On the last line, print the final array in square brackets with its
// elements separated by a comma and a space.
//•	See the examples below to get a better understanding of your task.
//Constraints
//•	The number of input lines will be in the range [2 … 50].
//•	The array elements will be integers in the range [0 … 1000].
//•	The number of elements will be in the range [1 ... 50].
//•	The split index will be an integer in the range [-231 … 231 – 1].
//•	The first/last count will be an integer in the range [1 … 231 – 1].
//•	There will not be redundant whitespace anywhere in the input.
//•	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
