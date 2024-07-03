package com.aditya.DP;

public class MinimumInsertionDeletionPalindrome {
    public static void main(String[] args) {
        String x = "aebcbda";
        System.out.println("Insertion -> " + longestpalindromsequence(x));
        System.out.println("Deletion -> " + longestpalindromsequence(x)); // same
    }

    private static int longestpalindromsequence(String str1) {
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        int n = str1.length();
        int m = str2.length();
        char[] x = str1.toCharArray();
        char[] y = str2.toString().toCharArray();

        int[][] dp = new int[n+1][m+1];
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (x[i] == y[j]) {
                    dp[i][j] = dp[i+1][j+1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }

        return n - dp[0][0];
    }
}
