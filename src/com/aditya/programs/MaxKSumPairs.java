package com.aditya.programs;

import java.util.Arrays;
import java.util.HashMap;

public class MaxKSumPairs {
    public static void main(String[] args) {
        int[] nums = { 3,1,3,4,3 };
        int k = 6;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        if (nums == null) return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int sum = k - num;
            if (map.containsKey(sum)) {
                count++;
                if (map.get(sum) == 1) map.remove(sum);
                else map.put(sum, map.get(sum) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

}
