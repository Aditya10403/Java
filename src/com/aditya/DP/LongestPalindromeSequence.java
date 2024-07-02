package com.aditya.DP;

public class LongestPalindromeSequence {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println("LPS -> " + longestpalindromesequence(s));
    }

    private static int longestpalindromesequence(String s) {
        StringBuilder x = new StringBuilder(s);
        x.reverse();
        return longestcommonsequence(x.toString(), s);
    }

    private static int longestcommonsequence(String str1, String str2) {
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
        return dp[0][0];
    }
}
