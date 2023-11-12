package 공부용;

import java.util.Random;

public class 퀵정렬 {
    public static void main(String[] args) {
        int size = 1000;
        int[] arr = new int[size];
        Random random = new Random();

        // 랜덤한 값으로 배열 초기화
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000); // 0부터 9999 사이의 랜덤한 값
        }

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[(low + high) / 2];

        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }

        return low;
    }

    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
