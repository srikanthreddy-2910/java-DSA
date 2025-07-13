// ✅ Problem 1: Reverse an Array (In-Place)
// 🔹 Problem Statement:
// Write a method reverse(int[] arr) that reverses the given array in-place. The method should modify the original array such that the first element becomes the last, the second becomes the second last, and so on.

// 🧠 Constraints:
// Do not use extra array (in-place reversal).
// Use the two-pointer approach.

// 📌 Example:
// Input:  arr = {1, 2, 3, 4, 5}  
// Output: arr = {5, 4, 3, 2, 1}

import java.util.*;

public class ReverseAnArray {
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        reverse(array);
        sc.close();
    }
}