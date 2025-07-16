// 🔹 Problem: Majority Element (> n/2 times)

// 🧩 Problem Statement:
// Given an array nums of size n, find the majority element — the element that
// appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.

// 📘 Example 1:
// Input: nums = [3, 2, 3]
// Output: 3

// 📘 Example 2:
// Input: nums = [2, 2, 1, 1, 1, 2, 2]
// Output: 2

// ✅ Constraints:
// 1 <= nums.length <= 10^5 
// -10^9 <= nums[i] <= 10^9

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void majorityEl(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])) {
                int count = map.getOrDefault(array[i], 0);
                count++;
                if (count > n / 2) {
                    System.out.println(array[i]);
                }
                map.put(array[i], count);
            }
        }
    }

    public static void boyerMooreVoting(int[] array) {
        int count = 0;
        int element = 0;
        for (int num : array) {
            if (count == 0) {
                element = num;
            }
            count += (num == element) ? 1 : -1;
        }
        System.out.println(element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        // majorityEl(array);
        boyerMooreVoting(array);
        sc.close();
    }
}