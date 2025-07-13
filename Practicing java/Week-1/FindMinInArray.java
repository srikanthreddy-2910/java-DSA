// ✅ Problem 3: Find Minimum in Array
// 🔹 Problem Statement:
// Write a method findMin(int[] arr) that returns the minimum value present in the given array using a single linear scan.

// 📌 Example:
// Input:  arr = {3, 17, 9, 5, 12}  
// Output: 3

import java.util.*;

public class FindMinInArray {
    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        findMin(array);
        sc.close();
    }
}