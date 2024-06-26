package com.aditya.programs;

public class TrapWater {
    public static void main(String[] args) {
        int[] tapwater = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(tapwater));
    }
    static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        int area = 0;
        while (left < right)
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    area += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    area += maxRight - height[right];
                }
                right--;
            }
        return area;
    }
}
