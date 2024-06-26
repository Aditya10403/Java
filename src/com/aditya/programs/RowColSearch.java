package com.aditya.programs;

import java.util.Arrays;

public class RowColSearch {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40},
                { 15, 25, 35, 45},
                { 28, 29, 37, 49},
                {33, 34, 38, 50}};
        System.out.println(Arrays.toString(BinarySearch_2d(matrix,37)));
    }
    static int[] BinarySearch_2d(int[][] matrix,int target){
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] > target){
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }
            else {
                return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }
}
