package com.Aditya;

// https://leetcode.com/problems/richest-customer-wealth/
// Richest customer Wealth problem.
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{ 1, 2, 3}, { 3, 2, 1}};
        System.out.println("Richest customer Wealth problem - ");
        System.out.println("The maximum wealth accounts is = " + maximumWealth(accounts));
        System.out.println("..End of Program..");
    }
    static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}