/*
Question:
Given a binary array arr, return the maximum number of consecutive 1's in the array.
 */

import java.util.Scanner;

public class MaxConsecutiveOnes {
    private static int findMaxConsecutiveOnes(int[] arr) {
        int ans = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
                if(count > ans)
                    ans = count;
            } else {
                count = 0;
            }
        }
        return ans;
    }

    private static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void main(String args[]) {
        int arr[] = takeInput();
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println("Maximum Consecutive Ones are: " + ans);
    }
}
