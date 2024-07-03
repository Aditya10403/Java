package com.aditya.DP;

public class LongestRepeatingSequence {
    public static void main(String[] args) {
        String x = "banana";
        System.out.println("Sequence -> " + longestrepeatingsequence(x));
    }
    private static String longestrepeatingsequence(String str1) {
        int n = str1.length();
        char[] x = str1.toCharArray();
        int max = Integer.MIN_VALUE, index = Integer.MIN_VALUE;
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (x[i-1] == x[j-1] && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        index = i;
                    }
                }
            }
        }
        return str1.substring(index - max, index);
    }
}
