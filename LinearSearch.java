import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the element to search:");
        int element = scanner.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element)
                return i;
        }
        return -1;
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
        int[] arr = takeInput();
        int index = linearSearch(arr);

        System.out.println("The element is present at index: " + index);
    }
}
