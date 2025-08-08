// ➤ Problem Statement:
// Given an array of integers arr[], find the Next Greater Element (NGE) for every element.
// The Next Greater Element for an element x is the first greater element on the right side of x in the array. If no such element exists, output -1.

// ➤ Input:
// int[] arr = {4, 5, 2, 25};
// ➤ Output:
// 5 25 25 -1
// Use Stack to solve it in O(n) time.

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] result = nextGreaterElements(array);

        System.out.println("Next Greater Elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
