// ✅ Problem 1: Leaders in an Array

// 🧩 Problem Statement:

// Given an array of integers arr[] of size n, print all leader elements in the
// array.
// An element is called a leader if it is greater than all the elements to its
// right.

// 📘 Example:
// Input: arr = [16, 17, 4, 3, 5, 2]
// Output: 2 5 17

// Explanation:
// - 2 is a leader as there is no element to the right of it.
// - 5 is greater than 2.
// - 17 is greater than all elements to its right (4, 3, 5, 2).

// 🎯 Constraints:
// 1 ≤ n ≤ 10⁵
// -10⁴ ≤ arr[i] ≤ 10⁴

// Stack : You can use a stack to reverse output order for leaders

import java.util.Scanner;

public class LeadersInArray {
    public static void leaders(int[] array) {
        int n = array.length;
        int leader = array[n - 1];
        System.out.println(leader);
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > leader) {
                System.out.println(array[i] + ", ");
                leader = array[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        leaders(array);
        sc.close();
    }
}