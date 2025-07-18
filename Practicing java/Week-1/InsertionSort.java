import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
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
        insertionSort(array);
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
