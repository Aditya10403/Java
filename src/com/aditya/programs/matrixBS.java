package com.aditya.programs;

public class matrixBS {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println((searchMatrix(arr, 34)));
    }
    static boolean searchMatrix(int[][] arr, int target)
    {
        int row = arr.length;
        int col = arr[0].length;
        int l = 0, h = row * col - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            int tC = mid % col;
            int tR = mid / col;
            int val = arr[tR][tC];
            if (val == target)
                return true;

            if (val < target)
                l = mid + 1;
            else
                h = mid - 1;
        }

        return false;
    }
}