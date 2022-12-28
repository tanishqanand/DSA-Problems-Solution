
import java.util.*;

public class RowWiseSum {
    private static void rowWiseSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " is: " + sum);
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
        rowWiseSum(arr);
    }
}
