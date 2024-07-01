package com.aditya.DP;

import static com.aditya.DP.LongestCommonSubsequence.longestCommonSubsequence;

public class ShortestCommonSuperSequence{
    public static void main(String[] args) {
        String str1 = "abac";
        String str2 = "cab";
        System.out.println("Length -> " + SCSlength(str1, str2));
        System.out.println("String -> " + SCSstring(str1, str2));
    }

    public static String SCSstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();
        int[][] dp = new int[n+1][m+1];
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (x[i] == y[j]) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (x[i] == y[j]) {
                ans.append(x[i]);
                i++;
                j++;
            } else if (dp[i+1][j] > dp[i][j+1]) {
                ans.append(x[i++]);
            } else {
                ans.append(y[j++]);
            }
        }
        while (i < n) ans.append(x[i++]);
        while (j < m) ans.append(y[j++]);

        return ans.toString();
    }

    public static int SCSlength(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        return n + m - longestCommonSubsequence(str1, str2, n, m);
    }
}
