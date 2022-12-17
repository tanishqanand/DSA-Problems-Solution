/*
Question:
Given an array Arr of size N, print second largest distinct element from an array.
 */

import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int largest = -1;
        int second_largest = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if(arr[i] > second_largest && arr[i] < largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
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
        int second_largest = secondLargest(arr);

        System.out.println("Second Largest Element is: " + second_largest);
    }
}
