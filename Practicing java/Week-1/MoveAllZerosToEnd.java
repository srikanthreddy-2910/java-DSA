// 🔹 2. Move All Zeros to the End (Maintain Order of Others)

// 🧩 Problem Statement:
// Given an array nums, move all 0s to the end of the array while maintaining
// the relative order of the non-zero elements.
// Do this in-place (without creating a copy of the array) and with minimal
// operations.

// Two-pointer Technique:
// One pointer iterates; the other keeps track of where to place the next
// non-zero.

// 📘 Example:
// Input: nums = [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]

// Input: nums = [0, 0, 1]
// Output: [1, 0, 0]

// 💡 Constraints:
// 1 ≤ nums.length ≤ 10^4
// -2^31 ≤ nums[i] ≤ 2^31 - 1

import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void MoveAllZeros(int[] array) {
        int n = array.length;
        int nonZero = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                swap(array, i, nonZero);
                nonZero++;
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        MoveAllZeros(array);
        sc.close();
    }
}
