import java.util.Scanner;

/*
Question:
Given a sorted array A[] of size N, delete all the duplicated elements from A[].
Modify the array such that if there are X distinct elements in it then the first X positions
of the array should be filled with them in increasing order and
return the number of distinct elements in the array.
 */
public class RemoveDuplicates {
    private static int removeDuplicates(int[] arr) {
        int pos = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[pos]) {
                pos++;
                arr[pos] = arr[i];
            }
        }
        return pos + 1;
    }

    private static void printArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
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
        int[] arr = takeInput();
        int len = removeDuplicates(arr);
        printArray(arr, len);
    }
}
