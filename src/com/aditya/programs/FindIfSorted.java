package com.aditya.programs;

import java.util.Arrays;

public class FindIfSorted {
    public static void main(String[] args) {
        int[] nums = { 8,4,2,30,15 };
        System.out.println(canSortArray(nums));
    }

    public static boolean canSortArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        System.arraycopy(nums, 0, arr, 0, n);
        Arrays.sort(arr);
        if (Arrays.equals(nums, arr)) return true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int x = Integer.bitCount(nums[j]);
                int y = Integer.bitCount(nums[j+1]);
                if (x == y && nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
        return Arrays.equals(nums, arr);
    }
}
