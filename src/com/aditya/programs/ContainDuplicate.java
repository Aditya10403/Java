package com.aditya.programs;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1,14,23,45,56,2,3 };
        int indexDiff = 1, valueDiff = 10;
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        /*
        Find a pair of indices (i, j) such that:
        i != j,
        abs(i - j) <= indexDiff.
        abs(nums[i] - nums[j]) <= valueDiff, and
        Return true if such pair exists or false otherwise.
        if (i != j && Math.abs(i - j) <= indexDiff && Math.abs(nums[i] - nums[j]) <= valueDiff)
        */
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            j = searchindex(Math.abs(i-indexDiff), 0, nums.length);
            if (j >= Math.abs(i-indexDiff)) {
                if (nums[j] >= Math.abs(nums[i] - valueDiff)) return true;
            }
        }
        return false;
    }

    public static int searchindex(int t, int s, int e) {
        int mid = s + (e - s) / 2;
        if (mid == t)
            return mid;
        else if (mid > t) {
            searchindex(t, s, mid-1);
        } else {
            searchindex(t, mid+1, e);
        }
        return -1;
    }
}
