// 2️⃣ Problem: Check if an Array is Sorted

// 📝 Problem Statement:
// Write a method isSorted(int[] arr) that returns true if the array is sorted
// in non-decreasing (ascending) order.

// 📌 Example:
// Input: [1, 2, 3, 4, 5] → Output: true
// Input: [1, 3, 2] → Output: false

// 🛠 Technique:
// Loop from 0 to n-2
// If arr[i] > arr[i+1], then array is not sorted

// 🧠 Tip:
// Can add variation: check for descending by adjusting comparison logic.

import java.util.Scanner;

public class CheckIfAnArrayIsSorted {
    public static void isSorted(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        isSorted(array);
        sc.close();
    }
}
