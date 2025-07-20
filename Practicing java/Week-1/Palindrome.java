// ✅ 3. Check if a Number is Palindrome (Using Recursion)

// Problem Statement:
// Write a recursive function to check whether a given number is a palindrome or
// not. A number is palindrome if it reads the same backward as forward.

// Input:
// An integer n.

// Output:
// true if the number is a palindrome, otherwise false.

// Example:
// Input: 121
// Output: true

import java.util.Scanner;

public class Palindrome {
    public static int palendrome(int number, int palin) {
        if (number == 0) {
            return palin;
        }
        int rem = number % 10;

        return palendrome(number / 10, palin * 10 + rem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int palin = palendrome(number, 0);
        if (palin == number) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        sc.close();
    }
}