/*
Question:
For a given two-dimensional integer array/list of size (N x M),
print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
 */

import java.util.Scanner;

public class WavePrint {
    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        int topToBottom = 1;
        int[] ans = new int [nRows * mCols];
        int k = 0;
        for (int j = 0; j < mCols; j++) {
            for (int i = 0; i < nRows; i++) {
                if (topToBottom == 0)
                    ans[k++] = arr[nRows - i - 1][j];
                else
                    ans[k++] = arr[i][j];
            }
            topToBottom = 1 - topToBottom;
        }
        return ans;
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static int[][] takeInput() {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        int[] ans = wavePrint(arr, arr.length, arr[0].length);
        printArray(ans);
    }
}
