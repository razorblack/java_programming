package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{33, 1, 2, 0, 55})));
    }
}
