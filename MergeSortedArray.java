/*
Question:
You are given two integer arrays arr1 and arr2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in arr1 and arr2 respectively.
 */

import java.util.Scanner;

public class MergeSortedArray {
    private static void mergeSortedArray(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        while (i >= 0) {
            arr1[k--] = arr1[i--];
        }

        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static int[] takeInput(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr1 = takeInput(m + n);
        int[] arr2 = takeInput(n);

        mergeSortedArray(arr1, m, arr2 , n);
        printArray(arr1);
    }
}
