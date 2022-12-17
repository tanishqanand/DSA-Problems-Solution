/*
Question:
Given an array arr, containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */

import java.util.Scanner;

public class MissingNumber {
    private static int findMissingNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i] ^ i;
        }
        return ans ^ arr.length;
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
        int ans = findMissingNumber(arr);
        System.out.println("Missing Number is: " + ans);
    }
}
