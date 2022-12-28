import java.util.Scanner;

public class LargestRowSum {
    private static int largestRowSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largestSum = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            largestSum = Math.max(largestSum, sum);
        }

        return largestSum;
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
        int largestSum = largestRowSum(arr);
        System.out.println("Largest Row Sum is: " + largestSum);
    }
}
