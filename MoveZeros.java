/*
Question:
Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
 */
import java.util.*;

public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int pos = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0)
                arr[++pos] = arr[i];
        }

        while(++pos != arr.length) {
            arr[pos] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
        int arr[] = takeInput();
        moveZeros(arr);
        printArray(arr);
    }
}
