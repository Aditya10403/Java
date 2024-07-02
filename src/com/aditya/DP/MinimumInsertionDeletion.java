package com.aditya.DP;

import java.util.Arrays;

public class MinimumInsertionDeletion {
    public static void main(String[] args) {
        String x = "leetcode";
        String y = "etco";
        int[] ans = LCSminSteps(x, y);
        System.out.println("Insertion -> " + ans[1]);
        System.out.println("Deletion -> " + ans[0]);
    }

    private static int[] LCSminSteps(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();

        int[][] dp = new int[n+1][m+1];
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (x[i] == y[j]) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        return new int[]{n - dp[0][0], m - dp[0][0]};
    }
}
