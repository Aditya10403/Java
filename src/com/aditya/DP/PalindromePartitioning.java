package com.aditya.DP;

import java.util.Arrays;

public class PalindromePartitioning {
    static int[][] dp = new int[6][6];
    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            Arrays.fill(dp[i], -1);
//        }
        String s = "nitik";
        System.out.println("no of partitions -> " + solveMCM(s, 0, s.length()-1));
    }

    private static int solveMCM(String s, int i, int j) {
        if (i >= j) return 0;
        if (ispalidrome(s, i, j)) {
            dp[i][j] = 0;
            return 0;
        }
        if (dp[i][j] != 0) return dp[i][j]; // dp
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int left, right;
            if (dp[i][k] != 0) {
                left = dp[i][k];
            } else {
                left = solveMCM(s, i, k);
            }
            if (dp[k+1][j] != 0) {
                right = dp[k+1][j];
            } else {
                right = solveMCM(s, k+1, j);
            }
            int temp = 1 + left + right;
            min = Math.min(min, temp);
        }
        return dp[i][j] = min; // dp
//        return min;
    }

    private static boolean ispalidrome(String s, int i, int j) {
        if (i >= j) return true;
        while ( i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
