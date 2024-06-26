package com.aditya.programs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble_Sort(int[] arr){
        boolean swapped;
        // run steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step max item will be at the last respective index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if item is smaller than previous
                if (arr[j] < arr[j - 1]){
                    // swap
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    swapped = true;
                }
            }
            // check if for a value i->row swapped is false.
            if (!swapped) break;
        }
    }
}
