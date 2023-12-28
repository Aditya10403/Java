package com.Aditya.DataStructureAndAlgorithm.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        cyclicSort(arr);
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i ,correct);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index, int correct){
        int tmp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = tmp;
    }
}
