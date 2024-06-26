package com.aditya.programs;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,5));
    }
    static int searchInsert(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int middle;
        while (start <= end){
            middle = start + (end - start) / 2;
            if (target < nums[middle]){
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }
        return start;
    }
}
