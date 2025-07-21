// ✅ 4. Permutations of a String or Array

// Problem Statement:
// Given a string or array of distinct elements, write a recursive function to
// print all permutations of the elements.
// If there are duplicates, ensure you handle and avoid duplicate permutations
// (e.g., by using a set).

// Input:
// A string or an array.
// Example: "ABC"

// Output:
// All possible permutations.

// Example: "ABC", "ACB", "BAC", "BCA", "CAB", "CBA"

import java.util.Scanner;

public class PermutationsOfString {
    public static void permutation(String str, String newString) {
        if (str.isEmpty()) {
            System.out.println(newString);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String pss = left + right;
            permutation(pss, newString + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutation(str, "");
        sc.close();
    }
}