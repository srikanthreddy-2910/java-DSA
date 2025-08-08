// 1️⃣ Valid Parentheses
// 📌 Problem Statement:
// Given a string containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid.

// A string is valid if:
// Open brackets are closed by the same type of brackets.
// Open brackets are closed in the correct order.

// Example:
// Input: "({[]})"
// Output: true

// Input: "(]"
// Output: false

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isValid(str));
        sc.close();
    }
}
