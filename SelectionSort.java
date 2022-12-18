/*
Question:
Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.
 */

import java.util.*;

public class SelectionSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int mini = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < mini) {
                    mini = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
        selectionSort(arr);
        printArray(arr);
    }
}