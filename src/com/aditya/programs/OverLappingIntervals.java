package com.aditya.programs;

import java.util.HashSet;
import java.util.Set;

public class OverLappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 100 },
                { 11, 22 },
                { 1, 11 },
                { 2, 12 },
        };
        System.out.println(eraseOverlapIntervals(intervals));
    }

    private static int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int[] arr: intervals) {
            if (a.contains(arr[0]) || b.contains(arr[1])) count++;
            else {
                a.add(arr[0]);
                b.add(arr[1]);
            }
        }
        return count;
    }
}
