/*
Question:
Given 2 sorted arrays, find all the elements which occur in both the arrays(Intersection).
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIntersection {
    private static ArrayList<Integer> arrayIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                res.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j])
                i++;
            else
                j++;
        }

        return res;
    }

    private static void printArray(ArrayList<Integer> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
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
        int arr1[] = takeInput();
        int arr2[] = takeInput();

        ArrayList<Integer> res = arrayIntersection(arr1, arr2);
        printArray(res);
    }
}
