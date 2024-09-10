package com.aditya.programs;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = { 1,2,3,4,5 }, cost = { 3,4,5,1,2 };
        System.out.println(canCompleteCircuit(gas, cost));
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            int idx = i, l = 0;
            int gasLeft = gas[i];
            while (l < n) {
                if (idx == n-1) {
                    gasLeft = gasLeft - cost[idx] + gas[0];
                    idx = -1;
                } else {
                    gasLeft = gasLeft - cost[idx] + gas[idx+1];
                }
                if (gasLeft <= 0) break;
                idx++;
                l++;
            }
            if (l == n) return i+1;
        }
        return -1;
    }
}
