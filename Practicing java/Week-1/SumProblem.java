// ✅ 1. 2-Sum Problem

// 🧩 Problem Statement:
// Given an array of integers nums and an integer target, return indices of the
// two numbers such that they add up to the target.
// You may assume that each input would have exactly one solution, and you may
// not use the same element twice.

// 📘 Example:
// Input: nums = [2, 7, 11, 15], target = 9
// Output: [0, 1]
// Explanation: nums[0] + nums[1] == 2 + 7 == 9

// --------------------------------------------------------------------------------------------

// ✅ 2. 3-Sum Problem

// 🧩 Problem Statement:
// Given an integer array nums, return all the unique triplets [nums[i],
// nums[j], nums[k]] such that:

// i ≠ j, j ≠ k, and i ≠ k

// nums[i] + nums[j] + nums[k] == target

// 📘 Example:
// Input: nums = [-1, 0, 1, 2, -1, -4] , target = 0
// Output: [[-1, -1, 2], [-1, 0, 1]]

// ------------------------------------------------------------------------------------------------------

// ✅ 3. 4-Sum Problem

// 🧩 Problem Statement: 
// Given an array nums of n integers and an integer target, return all unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// a ≠ b ≠ c ≠ d

// nums[a] + nums[b] + nums[c] + nums[d] == target

// 📘 Example:
// Input: nums = [1, 0, -1, 0, -2, 2], target = 0
// Output: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SumProblem {
    public static void SumOf2Element(int[] array, int target) {
        int num = array.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < num; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                System.out.println("[" + array[i] + "," + complement + "]");
            }
            map.put(array[i], i);
        }
    }

    public static void SumOf3Element(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array);
        int n = array.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && array[i] == array[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                if (sum == target) {
                    System.out.println(array[i] + " " + array[left] + " " + array[right]);
                    result.add(Arrays.asList(array[i], array[left], array[right]));

                    while (left < right && array[left] == array[left + 1])
                        left++;
                    while (left < right && array[right] == array[right - 1])
                        right--;

                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static void SumOf4Element(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array);
        int n = array.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && array[i] == array[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && array[j] == array[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) array[i] + array[j] + array[left] + array[right];

                    if (sum == target) {
                        result.add(Arrays.asList(array[i], array[j], array[left], array[right]));

                        while (left < right && array[left] == array[left + 1])
                            left++;
                        while (left < right && array[right] == array[right - 1])
                            right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        for (List<Integer> num : result) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        SumOf2Element(array, target);
        SumOf3Element(array, target);
        SumOf4Element(array, target);

        sc.close();
    }
}