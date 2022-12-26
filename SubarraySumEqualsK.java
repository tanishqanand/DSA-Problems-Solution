/* Question:
Given an array of integers nums and an integer k,
return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
 */

import java.util.*;

public class SubarraySumEqualsK {
    private static int countSubarray(int[] arr, int k) {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>(); // Sum, count
        map.put(0, 1);
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (map.containsKey(curSum - k)) {
                count += map.get(curSum - k);
            }

            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        }
        return count;
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
        int ans = countSubarray(arr, K);
        System.out.println("Number of Sub-arrays with Sum " + K + " are: " + ans);
    }
}
