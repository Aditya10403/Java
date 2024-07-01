package com.aditya.DP;


public class LongestCommonSubsequence {
    static int[][] dp = new int[6][7];
    public static void main(String[] args) {
        String x = "acbcf";
        String y = "abcdaf";
        System.out.println("LCS length -> " + longestCommonSubsequence(x, y)); // will give TLE
        System.out.println("LCS string -> " + LCSstring(x, y, 5, 6));
    }

    public static StringBuilder LCSstring(String x, String y, int n, int m) {
        StringBuilder s = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (x.charAt(i-1) == y.charAt(j-1)) {
                s.append(x.charAt(i-1));
                i--;
                j--;
            } else {
                if (dp[i-1][j] > dp[i][j-1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        return s.reverse();
    }

    public static int longestCommonSubsequence(String x, String y) {
        int n = x.length();
        int m = y.length();
        return longestCommonSubsequence(x, y, n, m);
    }

    public static int longestCommonSubsequence(String x, String y, int n, int m) {
        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
