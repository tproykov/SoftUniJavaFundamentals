package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class M04LongestSubsequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // read the numbers array from the console
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        // Find the Longest Increasing Subsequence (LIS) with the use of a method
        int[] lis = findLongestIncreasingSubsequence(nums);
        // Print the LIS
        for (int num : lis) {
            System.out.print(num + " ");
        }
    }
    public static int[] findLongestIncreasingSubsequence(int[] nums) {

        // len[i] = length of LIS ending at index i
        int[] len = new int[nums.length];
        // prev[i] = previous index of LIS ending at index i
        int[] prev = new int[nums.length];
        // Initialize len[] elements to 1s and prev[] elements to -1s
        for (int i = 0; i < nums.length; i++) {
            len[i] = 1;
            prev[i] = -1;
        }
        // populate len[] and prev[] - compute LIS ending at each index
        // compute the length of the maximum LIS and the list where the max LIS ends
        int maxLength = 0; // Length of the maximum LIS found
        int maxIndex = -1; // Index where the maximum LIS ends
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && len[j] + 1 > len[i]) {
                    len[i] = len[j] + 1;
                    prev[i] = j;
                }
            }
            // Update the maximum LIS length found
            if (len[i] > maxLength) {
                maxLength = len[i];
                maxIndex = i;
            }
        }
        // reconstruct the LIS from the previous array
        int[] lis = new int[maxLength];
        int index = maxLength - 1;
        for (int i = maxIndex; i >= 0; i = prev[i]) {
            lis[index--] = nums[i];
            if (prev[i] == -1) {
                break;
            }
        }
        return lis;
    }
}
// Read a list of integers and find the longest increasing subsequence (LIS). If several such exist,
// print the leftmost.
// •	Assume we have n numbers in an array nums[0…n-1].
//•	Let len[p] hold the length of the longest increasing subsequence (LIS) ending at position p.
//•	In a for loop, we shall calculate len[p] for p = 0 … n-1 as follows:
//o	Let left be the leftmost position on the left of p (left < p), such that len[left] is the largest possible.
//o	Then, len[p] = 1 + len[left]. If left does not exist, len[p] = 1.
//o	Also, save prev[p] = left (we hold if prev[] the previous position, used to obtain the best length for position p).
//•	Once the values for len[0…n-1] are calculated, restore the LIS starting from position p such that len[p] is maximal and go back and back through p = prev[p].
//•	The table below illustrates these computations: