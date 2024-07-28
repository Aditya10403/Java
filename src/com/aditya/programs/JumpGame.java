package com.aditya.programs;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = { 2,3,1,1,4 };
        System.out.println(canJump(nums));
    }

    private static boolean canJump(int[] nums) {boolean ans = false;
        int n = nums.length;
        int j, end = n - 1;
        for (int i = n - 2; i >= 0 ; i--) {
            if (i + nums[i] >= end) end = i;
        }
        return end <= 0;
    }
}
