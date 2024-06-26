package com.aditya.programs;// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Find the first and last position of element in sorted array.
import java.util.Arrays;

public class FindPositonofElement {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) ans[1] = search(nums, target, false);
        return ans;
    }
    static int search(int[] nums,int target,boolean findStartindex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (target < nums[middle]){
                end = middle - 1;
            }
            else if (target > nums[middle]){
                start = middle + 1;
            }
            else {
                ans = middle;
                if (findStartindex){
                    end = middle - 1;
                }
                else{
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
