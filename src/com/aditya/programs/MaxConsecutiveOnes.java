package com.aditya.programs;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,0,0,0,1,1,1,1,0 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k > nums.length) return 0;
        int i, j = 0;
        for (i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) k--;
            if (k < 0 && nums[j++] == 0) k++;
        }
        return i - j;
    }
}
