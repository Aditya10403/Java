package com.aditya.programs;

import java.util.Arrays;

public class SuccessfulPairs {
    public static void main(String[] args) {
        int[] spells = { 5,1,3 }, potions = { 1,2,3,4,5 };
        long success = 7;
        System.out.println(Arrays.toString(successfulPairs(spells, potions, success)));
    }

    private static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        int m = potions.length;
        int i = 0;
        Arrays.sort(potions);
        for (int s: spells) {
            int ans = binarySearch(potions, s, success);
            res[i++] = m - ans;
        }
        return res;
    }

    private static int binarySearch(int[] potions, int s, long success) {
        int start = 0, end = potions.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long product = (long) s * potions[mid];
            if (product >= success) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
