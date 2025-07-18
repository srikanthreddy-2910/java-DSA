import java.util.Scanner;

public class IterativeMergeSort {
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;

        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {

                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                merge(arr, leftStart, mid, rightEnd);
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
        mergeSort(array);
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
