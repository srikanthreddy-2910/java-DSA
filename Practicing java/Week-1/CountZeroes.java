// ✅ 1. Count Number of Zeroes in a Number

// Problem Statement:
// Write a recursive function that counts the number of zero digits in a given
// integer. Ignore leading zeros and count only actual digits in the number.

// Input:
// An integer n.

// Output:
// The count of 0 digits in the number.

// Example:
// Input: 1020400
// Output: 4

import java.util.Scanner;

public class CountZeroes {
    public static int countZeros(int num) {
        if (num == 0) {
            return 0;
        }

        return helperfn(num, false);
    }

    public static int helperfn(int num, boolean started) {
        if (num == 0) {
            return 0;
        }

        if (num % 10 == 0 && num / 10 == 0) {
            return 0;
        }

        int digit = num % 10;
        int remaining = num / 10;
        boolean newStarted = started || digit != 0;
        int count = (digit == 0 && newStarted) ? 1 : 0;

        if (num % 10 != 0) {
            started = true;
        }
        return count + helperfn(remaining, newStarted);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int result = countZeros(num);
        System.out.println(result);
    }
}