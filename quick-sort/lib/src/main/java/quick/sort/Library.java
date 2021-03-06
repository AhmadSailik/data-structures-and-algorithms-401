/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quick.sort;

import java.util.Arrays;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = (left - 1);
        for(int j = left; j <= right - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return (i + 1);
    }
    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        System.out.println(Arrays.toString( quickSort(arr, 0, arr.length - 1)));
    }
}

