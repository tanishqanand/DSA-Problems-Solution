/*
Question:
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 */

import java.util.*;

public class UniqueNumberOfOccurrences {
    private static boolean uniqueNumberOfOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
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
        boolean ans = uniqueNumberOfOccurrences(arr);
        System.out.println(ans);
    }
}
