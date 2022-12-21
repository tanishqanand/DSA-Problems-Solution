/*
Question:
Write a function that reverses a string. The input string is given as an array of characters arr.
You must do this by modifying the input array in-place with O(1) extra memory.
 */

import java.util.*;

public class ReverseString {
    private static void reverseString(char[] arr) {
        int i = 0, j = arr.length - 1;

        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    private static void printArray(char[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static char[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        String chars = scanner.next();
        char[] arr = chars.toCharArray();
        return arr;
    }

    public static void main(String[] args) {
        char[] arr = takeInput();
        reverseString(arr);
        printArray(arr);
    }
}
