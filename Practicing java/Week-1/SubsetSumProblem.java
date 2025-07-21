// ✅ 5. Subset Sum Problem

// Problem Statement:
// Given an array of integers and a target sum, write a recursive function to
// determine if there exists a subset of the array whose elements sum up to the
// target.

// Input:
// An array arr[] of size n
// An integer targetSum

// Output:
// Return true if a subset exists with sum = targetSum, otherwise false.

// Example:
// Input: arr = [3, 34, 4, 12, 5, 2], targetSum = 9
// Output: true (Because 4 + 5 = 9)

import java.util.Scanner;

public class SubsetSumProblem {
    public static boolean subSetSum(int[] array, int targetSum, int currentSum, int index) {
        if (targetSum == currentSum) {
            return true;
        }

        if (index >= array.length) {
            return false;
        }
 
        boolean include = subSetSum(array, targetSum, currentSum + array[index], index + 1);
        boolean exclude = subSetSum(array, targetSum, currentSum, index + 1);
        return include || exclude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();
        sc.close();
        boolean result = subSetSum(array, targetSum, 0, 0);
        System.out.println(result);
    }
}