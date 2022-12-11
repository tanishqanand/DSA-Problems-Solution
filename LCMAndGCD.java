/*
Question:
Given two numbers A and B. The task is to find out their LCM and GCD.
 */

import java.util.*;

public class LCMAndGCD {
    public static int lcm(int n1, int n2) {

    }
    public static int gcd(int n1, int n2) {
        int quo = Math.max(n1, n2);
        int div = Math.min(n1, n2);

        if(div == 0)
            return 1;

        while(true) {
            int remainder = quo % div;
            if(remainder == 0)
                break;
            quo = div;
            div = remainder;
        }

        return div;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int lcm = lcm(num1, num2);
        int gcd = gcd(num1, num2);

        System.out.println(lcm);
        System.out.println(gcd);
    }
}
