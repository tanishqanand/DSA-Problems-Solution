/*
Question:
Given an array, rotate the array to the right by k steps, where k is non-negative.
 */

import java.util.*;

public class RotateArray {
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = takeInput();
        int k = scanner.nextInt();
        rotate(arr, k);
        printArray(arr);
    }
}
