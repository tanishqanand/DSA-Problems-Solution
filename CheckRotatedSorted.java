/*
Question:
Given an array nums, return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length],
where % is the modulo operation.
 */

import java.util.Scanner;

public class CheckRotatedSorted {
    private static boolean checkRotatedSorted(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                count++;
        }

        if(arr[0] < arr[arr.length - 1])
            count++;

        return count <= 1;
    }
    private static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        boolean ans = checkRotatedSorted(arr);
        System.out.println(ans);
    }
}
