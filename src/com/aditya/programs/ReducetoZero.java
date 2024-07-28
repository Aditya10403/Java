package com.aditya.programs;

import java.util.Arrays;

public class ReducetoZero {
    public static void main(String[] args) {
        int[] nums = { 1,1 };
        int x = 4;
        System.out.println(minOperations(nums, x));
    }

    private static int minOperations(int[] nums, int x) {
        int i = 0, j = nums.length-1;
        int o = 0;
        while (i < j) {
            if (x == 0) return o;
            if (nums[i] <= x && nums[j] <= x) {
                if (nums[i] < nums[j]) {
                    x -= nums[j];
                    j--;
                } else {
                    x -= nums[i];
                    i++;
                }
                o++;
            } else if (nums[i] <= x || nums[j] <= x) {
                if (nums[i] <= x) {
                    x -= nums[i];
                    i++;
                } else {
                    x -= nums[j];
                    j--;
                }
                o++;
            } else {
                return -1;
            }
        }

        if (o != 0 && x == 0) return o;
        else return -1;
    }
}
