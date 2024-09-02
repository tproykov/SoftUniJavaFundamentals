package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class M04LongestSubsequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();



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