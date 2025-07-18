import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
    
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Before Sorting: ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        quickSort(array, 0, num - 1);

        System.out.print("After Sorting:  ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}