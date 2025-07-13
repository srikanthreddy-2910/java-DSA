// ✅ Problem 2: Find Maximum in Array
// 🔹 Problem Statement:
// Write a method findMax(int[] arr) that returns the maximum value present in the given array using a single linear scan.

// 📌 Example:
// Input:  arr = {3, 17, 9, 5, 12}  
// Output: 17

import java.util.*;

public class FindMaxInArray {
    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        findMax(array);
        sc.close();
    }
}