/*
Question:
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
*/

import java.util.*;

public class ReverseNumber {
    public static int reverse(int number) {
        int reversedNumber = 0;
        int flag = 0;

        if(number < 0) {
            flag = 1;
            number = Math.abs(number);
        }

        while(number > 0) {
            if(reversedNumber > Integer.MAX_VALUE / 10)
                return 0;

            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;

            number /= 10;
        }
        return flag == 0 ? reversedNumber : -reversedNumber;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int reversedNumber = reverse(number);

        System.out.println(reversedNumber);
    }
}
