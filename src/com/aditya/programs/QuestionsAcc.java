package com.aditya.programs;

import java.util.Arrays;

public class QuestionsAcc {
    public static void main(String[] args) {
        int[] nums = { 4, 0, 7, 9, 6, 4, 2 };
//        System.out.println(oddevensum(nums));

        String s = "bB1_89";
//        System.out.println(checkpassword(s));

        String b = "1C0C1C1A0B1";
//        System.out.println(calculateBinaryOperations(b));

        int[] res = greatest(nums);
//        System.out.println(res[0] + " " + res[1]);

        int[] houses = {2, 8, 3, 5, 7, 4, 1, 2};
//        System.out.println(noOfhouses(houses, 7, 2));

        System.out.println(fibonacci(8)); // 0 1 1 2 3 5 8 13
    }
    
    private static int fibonacci(int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n-1];
    }

    private static int noOfhouses(int[] nums, int r, int u) {
        if (nums.length == 0) return 0;
        int target = r * u;
        int food = 0;
        for (int i = 0; i < nums.length; i++) {
            food += nums[i];
            if (food >= target) {
                return i+1;
            }
        }
        return -1;
    }


    private static int[] greatest(int[] nums) {
        int index = -1, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return new int[]{index, max};
    }

    private static int calculateBinaryOperations(String s) {
        if (s.isEmpty()) return 0;

        int res = s.charAt(0) - '0', i = 1;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch <= '0' || ch >= '9') {
                if (ch == 'C') {
                    res ^= s.charAt(++i) - '0';
                } else if (ch == 'A') {
                    res &= s.charAt(++i) - '0';
                } else {
                    res |= s.charAt(++i) - '0';
                }
            }
            i++;
        }
        return res;
    }

    private static boolean checkpassword(String s) {
        if (s.length() < 4 || Character.isDigit(s.charAt(0))) return false;

        boolean d = false, c = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '/' || s.charAt(i) == ' ') {
                return false;
            } else if (s.charAt(i) > '0' && s.charAt(i) < '9') {
                d = true;
            } else if (s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
                c = true;
            }
        }
        return c && d ;
    }

    private static int oddevensum(int[] nums) {
        int[] odd = new int[nums.length/2+1];
        int[] even = new int[nums.length/2+1];
        int k = 0;
        for (int i = 0, j = 1; i < nums.length && j < nums.length ; i+=2, j+=2) {
            odd[k] =  nums[i];
            even[k] =  nums[j];
            k++;
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        return odd[odd.length-2] + even[even.length-2];
    }
}
