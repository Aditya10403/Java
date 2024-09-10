package com.aditya.programs;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] ratings = { 1,2,2 };
        System.out.println(candy(ratings));
    }

    private static int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) return 0;
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]) candies[i] = candies[i-1] + 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        int count = 0;
        for (int candy : candies) {
            count += candy;
        }
        return count;
    }
}
