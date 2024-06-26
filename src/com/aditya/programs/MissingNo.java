package com.aditya.programs;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {3, 0 ,1};
        System.out.println(missing(arr));
    }
    static int missing(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i ,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int index, int correct){
        int tmp = nums[index];
        nums[index] = nums[correct];
        nums[correct] = tmp;
    }
}
