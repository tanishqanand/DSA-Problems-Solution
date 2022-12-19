/*
Question:
Given an array of N integers, write a program to implement the Insertion sorting algorithm.
 */

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for(int j = 1; j < arr.length; j++) {
            int x = arr[j];
            int i = j - 1;
            for(; i >= 0; i--) {
                if(arr[i] > x)
                    arr[i + 1] = arr[i];
                else
                    break;
            }
            arr[i + 1] = x;
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
        insertionSort(arr);
        printArray(arr);
    }
}
