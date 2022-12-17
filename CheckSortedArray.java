/*
Question:
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.
 */

import java.util.Scanner;

public class CheckSortedArray {
    public static boolean checkSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        boolean ans = checkSorted(arr);

        System.out.println(ans);
    }
}
