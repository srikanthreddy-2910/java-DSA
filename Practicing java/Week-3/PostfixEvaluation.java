//  Evaluate Postfix Expression (Reverse Polish Notation)
// 📌 Problem Statement:
// You are given a mathematical expression in postfix notation (Reverse Polish Notation), where operands are integers and operators are one of +, -, *, /. The expression is given as a list of tokens.
// Your task is to evaluate the expression and return the result.
// Operands are pushed onto a stack.
// Operators pop operands from the stack, perform the operation, and push the result back.

// Example:
// Input: ["2", "1", "+", "3", "*"]  
// Output: 9  
// Explanation: (2 + 1) * 3 = 9 sol

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperation(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int applyOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b; 
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String[] tokens = str.split(" ");
        System.out.println(evalRPN(tokens));
    }
}