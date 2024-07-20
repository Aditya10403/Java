package com.aditya.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KthSmallest {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1,5,9 },
                { 10,11,13 },
                { 12,13,15 }
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }

    private static int kthSmallest(int[][] m, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] row : m) {
            for (int j = 0; j < m[0].length; j++) {
                list.add(row[j]);
            }
        }
        list.sort(Comparator.naturalOrder());
        return list.get(k-1);
    }

}
