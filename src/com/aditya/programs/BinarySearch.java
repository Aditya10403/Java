package com.aditya.programs;

import java.util.Arrays;
import java.util.Scanner;

// Order Agnostic Binary Search.
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = {-1, 2, 3, 4, 5, 6, 7, 8}; Ascending Order
        int[] arr = {9, 8, 7, 5, 4, 3, 1, -1, -2}; // Descending Order

        System.out.println("Order Agnostic Binary_Search program -");
        System.out.println("Your Array - " + Arrays.toString(arr));
        System.out.print("Enter a target to search in the above array - ");
        int target = in.nextInt();
        if (orderAgnosticBS(arr, target) != -1){
            System.out.println("The target is at " + orderAgnosticBS(arr, target) + ".");
        }
        else {
            System.out.println("The target not found in the array.");
        }
        System.out.println("..End of Program..");
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) return middle;
            if (isAsc) if (target > arr[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
            else {
                if (target < arr[middle]){
                    start = middle + 1;
                }
                else{
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
