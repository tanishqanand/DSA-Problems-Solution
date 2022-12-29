/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix 'matrix'.
This matrix has the following properties:
    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.
 */

import java.util.Scanner;

public class Search2DMatrix1 {
    private static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (matrix[mid / cols][mid % cols] == target)
                return true;
            else if (matrix[mid / cols][mid % cols] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;

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
        Scanner scanner = new Scanner(System.in);
        int[][] arr = takeInput();

        int target = scanner.nextInt();

        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }
}
