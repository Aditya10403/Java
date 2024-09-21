package com.aditya.programs;

import java.util.HashMap;

public class DeleteAndEarn {
    public static void main(String[] args) {
        int[] nums = { 2,2,3,3,3,4 };
        System.out.println(deleteAndEarn(nums));
    }

    private static int deleteAndEarn(int[] nums) {
        if (nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        for (int i = 1; i <= max; i++) {
            map.put(i, 0);
        }
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + num);
            } else {
                map.put(num, num);
            }
        }
        int notPick = 0, pick = map.get(1);
        for (int i = 2; i <= max; ++i) {
            int newPick = notPick + map.get(i);
            notPick = Math.max(pick, notPick);
            pick = newPick;
        }
        return Math.max(pick, notPick);
    }
}
