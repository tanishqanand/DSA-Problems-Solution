/*
Question:
Given an integer x, return true if x is a palindrome, and false otherwise.
 */

import java.util.*;

public class PalindromeNumber {
    public static boolean isPlaindrome(int number) {
        if(number < 0) return false;
        if(number > 0 && number % 10 == 0) return false;

        int temp = number;
        int reversedNumber = 0;
        while(temp > 0) {
            if(temp > Integer.MAX_VALUE / 10) return false;

            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        return reversedNumber == number;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean result = isPlaindrome(number);

        System.out.println(result);
    }
}
