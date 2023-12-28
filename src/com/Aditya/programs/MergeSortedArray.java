package com.Aditya.programs;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        nums1 = merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        nums1 = Arrays.copyOfRange(nums1 , 0, m);
        int[] mix = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            }
            else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m){
            mix[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n){
            mix[k] = nums2[j];
            k++;
            j++;
        }
        return mix;
    }
}
