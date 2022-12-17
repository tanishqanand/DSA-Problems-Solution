/*
Question:
Given an array A[] of size n. The task is to find the largest element in it.
 */

import java.util.Scanner;

public class LargestElement {
    public static int largestElement(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(maxi < arr[i])
                maxi = arr[i];
        }
        return maxi;
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
        int largest = largestElement(arr);

        System.out.println("Largest Element is: " + largest);
    }
}
