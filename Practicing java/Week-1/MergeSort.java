import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            array[left + x] = temp[x];
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

        mergeSort(array);

        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}