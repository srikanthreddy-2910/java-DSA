// b) Convert Infix to Postfix
// 📌 Problem Statement:
// Given an expression in infix notation (e.g., A + B * C), convert it to its equivalent postfix notation (e.g., A B C * +) using a stack to handle operator precedence and parentheses.
// Rules:

// Higher precedence operators are placed before lower precedence operators in postfix.
// Use parentheses to control order in infix.

// Example:
// Input: "A + B * C"  
// Output: "A B C * +" code 

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch).append(" ");
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        String postfix = infixToPostfix(infix.replaceAll("\\s+", ""));
        System.out.println(postfix);
    }
}