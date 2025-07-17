// ✅ Problem 2: Maximum Subarray Sum + (Kadane’s Algorithm)

// 🧩 Problem Statement:
// Given an array arr[] of n integers (can include negative numbers), find the
// maximum sum of a contiguous subarray using Kadane's Algorithm.

// 📘 Example:
// Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
// Output: 6

// Explanation:
// The subarray [4, -1, 2, 1] has the largest sum = 6.

// 🎯 Constraints:
// 1 ≤ n ≤ 10⁵
// -10⁴ ≤ arr[i] ≤ 10⁴

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void maxSum(int[] array) {
        int n = array.length;
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum = sum + array[i];
            maxi = Math.max(sum, maxi);
        }
        System.out.println(maxi);
    }

    public static void KadanesAlgo(int[] array) {
        int n = array.length;
        int currSum = array[0];
        int maxSum = array[0];

        for (int i = 1; i < n; i++) {

            currSum = Math.max(array[i], currSum + array[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        maxSum(array);
        KadanesAlgo(array);
        sc.close();
    }
}