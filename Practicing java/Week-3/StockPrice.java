// 3️⃣ Stock Span Problem
// 📌 Problem Statement:
// You are given an array price[] where price[i] is the price of a stock on the ith day.
// The stock span of the day is defined as:

// The maximum number of consecutive days before and including the current day where the stock price was less than or equal to the current day’s price.

// Example:
// Input: price[] = [100, 80, 60, 70, 60, 75, 85]
// Output:          [1,   1,  1,  2,  1,  4,  6]

import java.util.Scanner;
import java.util.Stack;

public class StockPrice {
    public static int[] stockSpan(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && array[stack.peek()] <= array[i]) {
                stack.pop();
            }
            result[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            stack.push(i);
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

        int[] result = stockSpan(array);

        System.out.println("Next Smaller Elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
