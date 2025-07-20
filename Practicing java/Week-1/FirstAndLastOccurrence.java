// ✅ 2. Find First and Last Occurrence of an Element in Array

// Problem Statement:
// Given an array and a key, write a recursive function to find the first and
// last index of the key in the array.

// Input:
// arr[]: array of integers
// key: integer to find

// Output:
// Print the first and last index of the key, or -1 if not found.

// Example:
// Input: arr = [1, 2, 3, 2, 4, 2], key = 2
// Output: First: 1, Last: 5

import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static void firstAndLast(int[] array, int key, int i, int[] result) {
        if (i == array.length) {
            return;
        }

        if (array[i] == key) {
            if (result[0] == -1) {
                result[0] = i;
            }
            result[1] = i;
        }

        firstAndLast(array, key, i + 1, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter key to find: ");
        int key = sc.nextInt();
        int[] result = { -1, -1 };
        firstAndLast(array, key, 0, result);
        sc.close();

        if (result[0] == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("First: " + result[0] + ", Last: " + result[1]);
        }
    }
}
