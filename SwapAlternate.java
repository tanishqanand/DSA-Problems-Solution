/*
Question:
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
 */

import java.util.*;

public class SwapAlternate {
    public static void swapAlternate(int[] arr) {
        int i = 0;
        while(i + 1 < arr.length) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i += 2;
        }
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
        int[] arr = takeInput();
        swapAlternate(arr);
        printArray(arr);
    }
}
