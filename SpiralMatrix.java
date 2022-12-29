/*
Question:
Given an m x n matrix, return all elements of the matrix in spiral order.
 */

import java.util.*;

public class SpiralMatrix {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int rs = 0, re = matrix.length - 1;
        int cs = 0, ce = matrix[0].length - 1;

        while (rs <= re && cs <= ce) {
            // Print first row
            for (int i = cs; i <= ce && rs <= re && cs <= ce; i++) {
                ans.add(matrix[rs][i]);
            }
            rs++;

            // Print last column
            for (int i = rs; i <= re && rs <= re && cs <= ce; i++) {
                ans.add(matrix[i][ce]);
            }
            ce--;

            //print last row in reverse
            for (int i = ce; i >= cs && rs <= re && cs <= ce; i--) {
                ans.add(matrix[re][i]);
            }
            re--;

            //print first column in reverse
            for (int i = re; i >= rs && rs <= re && cs <= ce; i--) {
                ans.add(matrix[i][cs]);
            }
            cs++;
        }

        return ans;
    }

    private static void printArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
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
        ArrayList<Integer> ans = spiralOrder(arr);
        printArray(ans);
    }
}
