package com.aditya.DP;

public class SuperEggDrop {
    static int[][] dp = new int[101][10001];
    public static void main(String[] args) {
        int e = 1, f = 2;
        System.out.println(superEggDrop(e, f));
    }

    private static int superEggDrop(int e, int f) {
        if (e == 1 || f == 0 || f == 1) return f;

        if (dp[e][f] != 0) return dp[e][f];

        int start = 1, end = f;
        int min = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int low, high;

            if (dp[e - 1][mid - 1] != 0) {
                low = dp[e - 1][mid - 1];
            } else {
                low = superEggDrop(e - 1, mid - 1);
                dp[e - 1][mid - 1] = low;
            }
            if (dp[e][f - mid] != 0) {
                high = dp[e][f - mid];
            } else {
                high = superEggDrop(e, f - mid);;
                dp[e][f - mid] = high;
            }

            int tmp = 1 + Math.max(low, high);
            if (low < high) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            min = Math.min(min, tmp);
        }
        return dp[e][f] = min;
    }
}
