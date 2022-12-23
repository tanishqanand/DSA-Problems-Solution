/*
Question:
Given an array of integers arr which is sorted in ascending order, and an integer target,
write a function to search target in arr.
If target exists, then return its index. Otherwise, return -1.
 */

import java.util.Scanner;

public class BinarySearch {
    private static int binarySearch(int[] arr, int x) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] < x) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
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
        Scanner scanner = new Scanner(System.in);
        int[] arr = takeInput();
        int target = scanner.nextInt();
        int index = binarySearch(arr, target);

        if(target == -1) {
            System.out.println("Element not found");
            return;
        }
        System.out.println("Element present at Index: " + index);
    }
}
