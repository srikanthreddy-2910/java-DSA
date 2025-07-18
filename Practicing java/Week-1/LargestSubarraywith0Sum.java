// ✅ 4. Largest Subarray with 0 Sum

// 🧩 Problem Statement:
// Given an array of integers, find the length of the longest subarray whose sum
// is equal to 0.

// 📘 Example:
// Input: arr = [15, -2, 2, -8, 1, 7, 10, 23]
// Output: 5 
// Explanation: The subarray [-2, 2, -8, 1, 7] sums to 0. 

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubarraywith0Sum {
    public static void maxLen(int[] array) {
        int num = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < num; i++) {
            sum += array[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        maxLen(array);
        sc.close();
    }
}