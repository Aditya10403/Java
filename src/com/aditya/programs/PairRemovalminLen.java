package com.aditya.programs;
import java.util.*;
public class PairRemovalminLen {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        int[] arr = {1,1,2,2};
        for (int i :
                arr) {
            nums.add(arr[i]);
        }
        System.out.println(nums);
        System.out.println(minLengthAfterRemovals(nums));
    }
    static int minLengthAfterRemovals(List<Integer> nums) {
        return valid(nums,0,nums.size(),1);
    }
    static int valid(List<Integer> arr,
                     int start,
                     int end,
                     int target){
        while (start <= end){
            int middle = start + (end - start) / 2;

            if (arr.get(middle) == target) return middle;
            if (target > arr.get(middle)) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
