package com.aditya.programs;

import java.util.Arrays;

public class ProductofArray {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] prodArray = new int[nums.length];
        int prod = 1, zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                prod *= num;
            }
        }
        if (zeroCount >= 2) {
            return prodArray;
        } else if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    prodArray[i] = prod;
                } else {
                    prodArray[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                prodArray[i] = prod / nums[i];
            }
        }
        return prodArray;
    }
}
