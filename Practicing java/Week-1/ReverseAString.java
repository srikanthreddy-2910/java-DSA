// ✅ 6. Reverse a String Using Recursion

// Problem Statement:
// Write a recursive function that takes a string and returns the reverse of it.

// Input:
// A string s.

// Output: 
// The reversed string.

// Example:
// Input: "hello"
// Output: "olleh"

import java.util.Scanner;

public class ReverseAString {
    public static void reverseStr(String str, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(str.charAt(i));

        reverseStr(str, i - 1);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseStr(str, str.length() - 1);
        sc.close();
    }
}