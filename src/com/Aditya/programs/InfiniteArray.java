package com.Aditya.programs;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(Position(nums, target));
    }
    static int Position(int[] nums,int target){
        int start = 0;
        int end = 1;
        while (target > nums[end]){
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return binary_Search(nums, target, start, end);
    }
    static int binary_Search(int[] nums,int target,int start,int end){
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (target < nums[middle]){
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
