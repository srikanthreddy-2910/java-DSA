import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElement {
    public static int[] nextSmallerElements(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= array[i]) {
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

        int[] result = nextSmallerElements(array);

        System.out.println("Next Smaller Elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
