package com.aditya.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndCol {
    public static void main(String[] args) {
        int[][] nums = {
                { 3,2,1 },
                { 1,7,6 },
                { 2,7,7 }
        };
        System.out.println(equalPairs(nums));
    }

    public static int equalPairs(int[][] nums) {
        if (nums.length == 0) return 0;
        int count = 0;
        Map<ArrayList<Integer>, Integer> map = new HashMap<>();
        for (int[] num : nums) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < nums[0].length; j++) {
                row.add(num[j]);
            }
            map.put(row, map.getOrDefault(row, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> col = new ArrayList<>();
            for (int j = 0; j < nums[0].length; j++) {
                col.add(nums[j][i]);
            }
            count += map.getOrDefault(col, 0);
        }
        return count;
    }
}
