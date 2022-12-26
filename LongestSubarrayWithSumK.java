/*
Question:
Given an array containing N integers and an integer K.
Your task is to find the length of the longest Sub-Array with the
sum of the elements equal to the given value K.
 */
import java.util.*;

public class LongestSubarrayWithSumK {
    private static int longestSubarray(int[] arr, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int curSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (map.containsKey(curSum - K)) {
                maxLength = Math.max(maxLength, i - map.get(curSum - K));
            }

            if (map.containsKey(curSum) == false) {
                map.put(curSum, i);
            }
        }
        return maxLength;
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
        Scanner scanner = new Scanner(System.in);
        int[] arr = takeInput();
        int K = scanner.nextInt();
        int ans = longestSubarray(arr, K);
        System.out.println("Longest Length of the Subarray with Sum " + K + " is: " + ans);
    }
}
