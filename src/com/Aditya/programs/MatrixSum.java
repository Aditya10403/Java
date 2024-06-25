package com.Aditya.programs;

import java.util.Random;

public class MatrixSum {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] nums = new int[5][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = r.nextInt(1, 9);
            }
        }
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
        int rowSum, colSum;
        int[] row = new int[5];
        int[] col = new int[5];
        for (int i = 0; i < nums.length; i++) {
            rowSum = colSum = 0;
            for (int j = 0; j < nums[0].length; j++) {
                rowSum += nums[i][j];
                colSum += nums[j][i];
            }
            row[i] = rowSum;
            col[i] = colSum;
        }

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if (row[i] == col[j]) {
                    System.out.print("\nrow -> " + i + " col -> " + j + " Sum = " + row[i]);
                }
            }
        }
    }

}
