import java.util.Arrays;
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 3, 5, 7, 9};
        int index = 4;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(exchange(array, index)));

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
}