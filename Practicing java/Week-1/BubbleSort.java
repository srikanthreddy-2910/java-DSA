import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
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
        sc.close();
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubbleSort(array);
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
