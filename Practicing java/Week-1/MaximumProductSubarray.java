// ✅ 5. Maximum Product Subarray

// 🧩 Problem Statement:
// Given an integer array nums, find the contiguous subarray within an array
// (containing at least one number) which has the largest product.

// 📘 Example:
// Input: nums = [2, 3, -2, 4]
// Output: 6
// Explanation: [2, 3] has the largest product = 6. 

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void maxProduct(int[] nums) {

        int currMax = nums[0];
        int currMin = nums[0];
        int maxProd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            if (nums[i] < 0) {
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            maxProd = Math.max(maxProd, currMax);
        }

        System.out.println(maxProd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        maxProduct(array);
        sc.close();
    }
}