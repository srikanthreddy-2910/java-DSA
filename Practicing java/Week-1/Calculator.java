// 🧩 Problem 1: Method Overloading

// Problem Statement:
// Create a class Calculator with multiple calculate() methods to:
// Return the sum of two integers.
// Return the average of three double values.

public class Calculator {

    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.calculate(10, 20));
        System.out.println("Average: " + calc.calculate(10.5, 20.5, 30.0));
    }
}
