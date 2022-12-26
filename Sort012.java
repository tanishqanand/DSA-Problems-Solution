/*
Question:
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 */

import java.util.Scanner;

public class Sort012 {
    public static void sort(int[] arr) {
        int zeroPos = 0;
        int twoPos = arr.length - 1;

        int i = 0;
        while(i <= twoPos) {
            if (arr[i] == 0) {
                swap(arr, zeroPos, i);
                zeroPos++;
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, twoPos);
                twoPos--;
            } else
                i++;
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        sort(arr);
        printArray(arr);
    }
}
