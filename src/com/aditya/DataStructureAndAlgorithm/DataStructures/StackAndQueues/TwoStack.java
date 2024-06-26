package com.aditya.DataStructureAndAlgorithm.DataStructures.StackAndQueues;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = in.nextInt();
            }
            System.out.println(twoStacks(x, a, b));
        }
    }
    static int twoStacks(int x, int[] a, int[] b) {
        // helper function
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) return count;

        if (a.length == 0 || b.length == 0) return count;

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + a[0], count + 1);
        return Math.max(ans1, ans2);
    }
}
