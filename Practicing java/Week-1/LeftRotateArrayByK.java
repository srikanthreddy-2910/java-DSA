// 1️⃣ Problem: Left Rotate Array by K

// 📝 Problem Statement:
// Write a method rotate(int[] arr, int k) that left-rotates the given array by
// k positions. The rotation should modify the original array.

// 🧠 Constraints:
// 0 <= k <= arr.length
// In-place preferred, but temp array is allowed

// 📌 Example:
// Input: arr = [1, 2, 3, 4, 5], k = 2
// Output: arr = [3, 4, 5, 1, 2]

// 🛠 Approaches:
// Brute Force: Shift one by one, k times → O(n*k)
// Using Temp Array: Copy first k, shift rest → O(n), O(k)
// Optimal (Reverse Algorithm): Reverse parts of array
// Reverse 0 to k-1
// Reverse k to n-1
// Reverse entire array

import java.util.Scanner;

public class LeftRotateArrayByK {
    public static void rotateBruteForce(int[] arr, int k) {
        for (int a = 0; a < k; a++) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] arr, int first, int last) {
        for (int i = first, j = last; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // rotateBruteForce(array, target);
        rotate(array, k);
        sc.close();
    }
}
