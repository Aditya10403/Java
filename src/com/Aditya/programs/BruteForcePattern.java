package com.Aditya.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class BruteForcePattern {
    public static void main(String[] args){
        String a = "Hello world";
        String b = "world";
//        System.out.println("Ans = " + searchPattern(a,b));
        int[] nums = { 1, 3, 5, 2, 2};
//        System.out.println(countTriplets(nums));
//        FindMax(nums);
//        FindMin(nums);
//        System.out.println(maxSubArray(nums, 2));
        System.out.println(sum(nums));
    }


    public static boolean searchPattern(String s1, String s2) {
        int i, j;
        int n = s1.length();
        int m = s2.length();
        for (i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                for (j = 0; j < m; j++) {
                    if (s1.charAt(i+j)!=s2.charAt(j)){
                        break;
                    }
                }
                if (j == m) return true;
            }
        }
        return false;
    }
    public static int countTriplets(int nums[]){
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] == nums[k]) {
                        count++;
                    }
                    else if (nums[i] + nums[k] == nums[j]) {
                        count++;
                    }
                    else if (nums[j] + nums[k] == nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void FindMax(int nums[]){
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i]>max1) {
                max1 = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]>max2 && nums[i]!=max1) {
                max2= nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]>max3 && (nums[i]!=max1 && nums[i]!=max2)) {
                max3 = nums[i];
            }
        }
        System.out.println(max1 + " " + max2 + " " + max3 +" ");
    }
    public static void FindMin(int nums[]){
        int n = nums.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i]<min1) {
                min1 = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]<min2 && nums[i]!=min1) {
                min2= nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]<min3 && (nums[i]!=min1 && nums[i]!=min2)) {
                min3 = nums[i];
            }
        }
        System.out.println(min1 + " " + min2 + " " + min3 +" ");
    }
    public static long maxSubArray(int[] nums, int k){
        long ans = Integer.MIN_VALUE;
        int sum = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            if (r-l+1 == k) {
                ans = Math.max(ans, sum);
                sum -= nums[l];
                l++;
            }
        }
        return ans;
    }
    public static int sum(int[] nums){
        int total = 0;
        int leftsum = 0;
        for (int num : nums) {
            total += num;
        }
        for (int i = 0; i < nums.length; i++) {
            total -= nums[i];
            if (leftsum == total) return i+1;
            leftsum += nums[i];
        }
        return -1;
    }
    public static void prCharWithFreq(String s){
        Map<Character, Integer> d
                = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (d.containsKey(s.charAt(i))) {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            }
            else {
                d.put(s.charAt(i), 1);
            }
        }
//        for (char ch: d.containsKey(ch)){
//
//        }
    }
}
